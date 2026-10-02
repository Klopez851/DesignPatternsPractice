package kl.practice.Behavioral.Observer.PullObserverPattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PhoneDisplay implements Subscriber{

    @Override
    public void update(WeatherStation weatherStation) {
        System.out.println("Weather station temperature changed to "+weatherStation.getTemperature()+" in phone display");
    }
}
