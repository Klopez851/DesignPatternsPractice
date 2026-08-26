package kl.practice.Structural.Adapter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
class LegacyTemperatureSensor {
    public double getTemperatureFahrenheit() {
        return 86.0;
    }
}