package kl.practice.Behavioral.Observer.EventObserverPattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PhoneDisplay implements Subscriber{

    @Override
    public void update(WeatherStation weatherStation) {
        System.out.println("Weather station temperature changed to "+weatherStation.getTemperature()+"" +
                " and humidity to "+weatherStation.getHumidity()+" in phone display");
    }
}
