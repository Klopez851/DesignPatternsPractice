package kl.practice.Structural.Adapter;

/*
 * ============================================================
 * 1. ADAPTER — Legacy Temperature API
 * ============================================================
 *
 * INITIAL EXERCISE
 *
 * You have an existing class that you CANNOT modify:
 *
 *     class LegacyTemperatureSensor {
 *         public double getTemperatureFahrenheit() {
 *             return 86.0;
 *         }
 *     }
 *
 * Your application expects:
 *
 *     interface TemperatureSensor {
 *         double getTemperatureCelsius();
 *     }
 *
 * Create an implementation that allows the application to use
 * LegacyTemperatureSensor through TemperatureSensor.
 *
 * Expected:
 *
 *     TemperatureSensor sensor = ...;
 *     sensor.getTemperatureCelsius(); // 30.0
 *
 * Constraints:
 * - Do not modify LegacyTemperatureSensor.
 * - Do not modify TemperatureSensor.
 * - The client should only know about TemperatureSensor.
 *
 *
 * FOLLOW-UP
 *
 * The company replaces its old sensor with another legacy API:
 *
 *     class EuropeanTemperatureSensor {
 *         public double readCelsius() {
 *             return 25.0;
 *         }
 *     }
 *
 * Your application should continue using:
 *
 *     TemperatureSensor
 *
 * without changing the client code.
 *
 * Add support for the new sensor.
 *
 * QUESTION TO CONSIDER:
 *
 * What should be shared between your two adapters, if anything?
 *
 * ============================================================
 */

public class main {

    public static void main(String[] args) {

        TemperatureSensor sensor = new EuropeanTemperatureSensorAdapter();

        System.out.println(sensor.getTemperatureCelsius());

    }
}
