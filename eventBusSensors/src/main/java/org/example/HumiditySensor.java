package org.example;

import org.greenrobot.eventbus.EventBus;
import java.util.Random;

public class HumiditySensor {
    private final String sensorId;
    private final Random random = new Random();

    public HumiditySensor(String sensorId) {
        this.sensorId = sensorId;
    }

    public void generateData() {
        double humidity = 100 * random.nextDouble();
        EventBus.getDefault().post(new HumidityEvent(sensorId, humidity));
    }
}