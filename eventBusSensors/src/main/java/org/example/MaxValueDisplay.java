package org.example;

import org.greenrobot.eventbus.Subscribe;

public class MaxValueDisplay {
    private final String displayId;
    private double maxTemperature = 0;
    private double maxWaterLevel = 0;
    private double maxHumidity = 0;

    public MaxValueDisplay(String displayId) {
        this.displayId = displayId;
    }

    @Subscribe
    public void onTemperatureEvent(TemperatureEvent event) {
        if (event.getTemperature() > maxTemperature) {
            maxTemperature = event.getTemperature();
        }
        System.out.println(displayId + " - Max Temperature: " + maxTemperature);
    }

    @Subscribe
    public void onWaterLevelEvent(WaterLevelEvent event) {
        if (event.getWaterLevel() > maxWaterLevel) {
            maxWaterLevel = event.getWaterLevel();
        }
        System.out.println(displayId + " - Max Water Level: " + maxWaterLevel);
    }

    @Subscribe
    public void onHumidityEvent(HumidityEvent event) {
        if (event.getHumidityLevel() > maxHumidity) {
            maxHumidity = event.getHumidityLevel();
        }
        System.out.println(displayId + " - Max Humidity: " + maxHumidity);
    }
}