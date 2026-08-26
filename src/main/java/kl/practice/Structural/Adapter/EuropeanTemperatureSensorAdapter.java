package kl.practice.Structural.Adapter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class EuropeanTemperatureSensorAdapter implements TemperatureSensor{

    EuropeanTemperatureSensor legacySensor = new EuropeanTemperatureSensor();
    @Override
    public double getTemperatureCelsius() {
        return legacySensor.readCelsius();
    }
}
