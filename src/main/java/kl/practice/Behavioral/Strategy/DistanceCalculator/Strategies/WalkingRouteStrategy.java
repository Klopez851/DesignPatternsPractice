package kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WalkingRouteStrategy implements RouteStrategy{
    @Override
    public int calculateRoute(String start, String destination) {
        System.out.printf("Calculating walking distance from %s to %s...", start, destination);
        return 50;
    }
}
