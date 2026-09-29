package kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies;

import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
public class NavigationService {
    private RouteStrategy strategy;

    public int calculateDistance(String start, String destination){
       return strategy.calculateRoute(start, destination);
    }
}
