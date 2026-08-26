package kl.practice.Structural.Adapter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class LegacyTemperatureSensorAdapter implements TemperatureSensor{

    private LegacyTemperatureSensor legacySensor = new LegacyTemperatureSensor();

    @Override
    public double getTemperatureCelsius() {
        //(°F - 32) × 5/9
        return ((legacySensor.getTemperatureFahrenheit()-32)*0.555555555556);
    }
}
