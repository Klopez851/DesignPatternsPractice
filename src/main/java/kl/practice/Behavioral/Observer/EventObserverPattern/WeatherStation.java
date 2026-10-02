package kl.practice.Behavioral.Observer.EventObserverPattern;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class WeatherStation {
    @Getter
    private int temperature;

    @Getter
    @Setter
    private int humidity;
    private List<Subscriber> subscriberList = new ArrayList<>();

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }
    public void setHumidity(int humidity){
        this.humidity = humidity;
        notifyObservers();
    }

    public void registerObserver(Subscriber subscriber){
        subscriberList.add(subscriber);
    }
    public void removeObserver(Subscriber subscriber){
        int subcriberIndex = subscriberList.indexOf(subscriber);

        if(subcriberIndex == -1){
            System.out.println("Subscriber nor found");
            return;
        }

        subscriberList.remove(subcriberIndex);
    }
    public void notifyObservers(){
        subscriberList.forEach(subscriber -> subscriber.update(this));
    }
}
