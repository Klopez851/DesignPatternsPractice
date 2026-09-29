package kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CyclingRouteStrategy implements RouteStrategy{
    @Override
    public int calculateRoute(String start, String destination) {
        System.out.printf("Calculating cycling distance from %s to %s...", start, destination);
        return 30;
    }
}
