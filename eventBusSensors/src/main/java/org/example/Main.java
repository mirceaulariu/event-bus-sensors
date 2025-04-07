package org.example;
import org.greenrobot.eventbus.EventBus;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) {
        //create the eventBus
        EventBus eventBus = EventBus.getDefault();

        // create displays
        NumericDisplay numericDisplay = new NumericDisplay("NumericDisplay1");
        MaxValueDisplay maxValueDisplay = new MaxValueDisplay("MaxValueDisplay1");
        TextDisplay textDisplay = new TextDisplay("TextDisplay1");

        //register the displays as subscribers to the event bus
        eventBus.register(numericDisplay);
        eventBus.register(textDisplay);
        eventBus.register(maxValueDisplay);

        // create and start sensors
        TemperatureSensor tempSensor1 = new TemperatureSensor("TempSensorTimisoara");
        TemperatureSensor tempSensor2 = new TemperatureSensor("TempSensorArad");
        WaterLevelSensor waterLevelSensor1 = new WaterLevelSensor("WLSensorTimisoara");
        WaterLevelSensor waterLevelSensor2 = new WaterLevelSensor("WLSensorArad");
        HumiditySensor humiditySensor1 = new HumiditySensor("HSensorTimisoara");
        HumiditySensor humiditySensor2 = new HumiditySensor("HSensorArad");


        for(int i=0;i<5;i++){

            //generate sensor readings
            tempSensor1.generateData();
            waterLevelSensor1.generateData();
            humiditySensor1.generateData();
            tempSensor2.generateData();
            waterLevelSensor2.generateData();
            humiditySensor2.generateData();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*while (true) {
            tempSensor1.generateData();
            waterLevelSensor1.generateData();
            humiditySensor1.generateData();
            tempSensor2.generateData();


            waterLevelSensor2.generateData();


            humiditySensor2.generateData();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
    }


}