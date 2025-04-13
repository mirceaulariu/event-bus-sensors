package org.example;

import org.greenrobot.eventbus.EventBus;
import java.util.Random;

public class WaterLevelSensor {
    private final String sensorId;
    private final Random random = new Random();

    public WaterLevelSensor(String sensorId) {
        this.sensorId = sensorId;
    }

    //create and post the event
    public void generateData() {
        double waterLevel = 100* random.nextDouble();
        EventBus.getDefault().post(new WaterLevelEvent(sensorId, waterLevel));
    }
}