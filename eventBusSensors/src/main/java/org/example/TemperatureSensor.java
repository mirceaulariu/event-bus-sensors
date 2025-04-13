package org.example;

import org.greenrobot.eventbus.EventBus;
import java.util.Random;

public class TemperatureSensor {
    private final String sensorId;
    private final Random random = new Random();

    public TemperatureSensor(String sensorId) {
        this.sensorId = sensorId;
    }

    public void generateData() {
        double temperature = -10 + (50 - 10) * random.nextDouble();
        EventBus.getDefault().post(new TemperatureEvent(sensorId, temperature));
    }

}