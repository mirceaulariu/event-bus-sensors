package org.example;

public class WaterLevelEvent {
    private final String sensorId;
    private final double waterLevel;

    public WaterLevelEvent(String sensorId, double waterLevel) {
        this.sensorId = sensorId;
        this.waterLevel = waterLevel;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getWaterLevel() {
        return waterLevel;
    }
}