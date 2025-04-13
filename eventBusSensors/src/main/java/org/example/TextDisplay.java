package org.example;

import org.greenrobot.eventbus.Subscribe;

public class TextDisplay {
    private final String displayId;

    public TextDisplay(String displayId) {
        this.displayId = displayId;
    }

    // listens for events of different types
    @Subscribe
    public void onTemperatureEvent(TemperatureEvent event) {
        String text;
        if (event.getTemperature() < 20) {
            text = "cold";
        } else {
            text = "warm";
        }
        System.out.println(displayId + " - Temperature from " + event.getSensorId() + ": " + text);
    }

    @Subscribe
    public void onWaterLevelEvent(WaterLevelEvent event) {
        String text;
        if (event.getWaterLevel() < 50) {
            text = "low";
        } else {
            text = "high";
        }
        System.out.println(displayId + " - Water level from " + event.getSensorId() + ": " + text);
    }

    @Subscribe
    public void onHumidityEvent(HumidityEvent event) {
        String text;
        if (event.getHumidityLevel() < 50) {
            text = "dry";
        } else {
            text = "humid";
        }
        System.out.println(displayId + " - Humidity from " + event.getSensorId() + ": " + text);
    }
}