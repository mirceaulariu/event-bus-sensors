package org.example;

import org.greenrobot.eventbus.Subscribe;

public class NumericDisplay {
    private final String displayId;

    public NumericDisplay(String displayId) {
        this.displayId = displayId;
    }

    //if an event of the given type is posted on the bus, call the method and pass the event to it
    @Subscribe
    public void onTemperatureEvent(TemperatureEvent event) {
        System.out.println(displayId + " - Temperature from " + event.getSensorId() + ": " + event.getTemperature());
    }

    @Subscribe
    public void onWaterLevelEvent(WaterLevelEvent event) {
        System.out.println(displayId + " - Water level from " + event.getSensorId() + ": " + event.getWaterLevel());
    }

    @Subscribe
    public void onHumidityEvent(HumidityEvent event) {
        System.out.println(displayId + " - Humidity from " + event.getSensorId() + ": " + event.getHumidityLevel());
    }
}