package org.example;

public class HumidityEvent {
    private final String sensorId;
    private final double humidityLevel;

    public HumidityEvent(String sensorId, double humidityLevel) {
        this.sensorId = sensorId;
        this.humidityLevel = humidityLevel;
    }

    public String getSensorId() {
        return sensorId;
    }

    public double getHumidityLevel() {
        return humidityLevel;
    }
}