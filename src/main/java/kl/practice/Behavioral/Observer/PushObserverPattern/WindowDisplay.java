package kl.practice.Behavioral.Observer.PushObserverPattern;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class WindowDisplay implements Subscriber{
    @Override
    public void update(int temparature) {
        System.out.println("Temperature updated to "+temparature+" in window display");

    }
}
