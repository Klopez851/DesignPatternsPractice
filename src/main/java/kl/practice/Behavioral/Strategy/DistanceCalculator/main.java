package kl.practice.Behavioral.Strategy.DistanceCalculator;

import kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies.CyclingRouteStrategy;
import kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies.DrivingRouteStrategy;
import kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies.NavigationService;
import kl.practice.Behavioral.Strategy.DistanceCalculator.Strategies.WalkingRouteStrategy;

public class main {
    public static void main(String[] args) {
        NavigationService navigation = new NavigationService();

        navigation.setStrategy(
                new DrivingRouteStrategy()
        );

        int time = navigation.calculateDistance(
                "Boston",
                "New York"
        );

        System.out.printf("It'll take approximately %d minutes to get there\n", time);

        navigation.setStrategy(
                new CyclingRouteStrategy()
        );
        time = navigation.calculateDistance(
                "Boston",
                "New York"
        );
        System.out.printf("It'll take approximately %d minutes to get there\n", time);

        navigation.setStrategy(
                new WalkingRouteStrategy()
        );
        time = navigation.calculateDistance(
                "Boston",
                "New York"
        );
        System.out.printf("It'll take approximately %d minutes to get there\n", time);
    }
}
