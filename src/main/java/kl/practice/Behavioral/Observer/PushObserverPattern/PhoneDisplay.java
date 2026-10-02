package kl.practice.Behavioral.Observer.PushObserverPattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PhoneDisplay implements Subscriber{

    @Override
    public void update(int temparature) {
        System.out.println("Temperature updated to "+temparature+" in phone display");
    }
}
