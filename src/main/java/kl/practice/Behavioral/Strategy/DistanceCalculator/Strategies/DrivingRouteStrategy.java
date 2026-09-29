package kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DrivingRouteStrategy implements RouteStrategy {
    @Override
    public int calculateRoute(String start, String destination) {
        System.out.printf("Calculating driving distance from %s to %s...", start, destination);
        return 10;
    }
}
