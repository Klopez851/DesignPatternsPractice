package kl.practice.Behavioral.Observer.EventObserverPattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StatisticsDisplay implements Subscriber{
    @Override
    public void update(WeatherStation weatherStation) {
        System.out.println("Weather station humidity changed to "+weatherStation.getHumidity()+" in statistics display");
    }
}
