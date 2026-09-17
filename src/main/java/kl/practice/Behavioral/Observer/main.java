package kl.practice.Behavioral.Observer;
/*
============================================================
OBSERVER DESIGN PATTERN — EXERCISE 1
============================================================

SCENARIO:

You're building a weather application.

A WeatherStation receives new temperature measurements.

Several parts of your application are interested in the
temperature:

    PhoneDisplay
    WindowDisplay
    StatisticsDisplay

Whenever the temperature changes, all interested displays
should be notified automatically.


YOUR TASK:

Implement the Observer design pattern from scratch.

Create:

    1. Observer interface

       It should have a method such as:

           update(...)

       The Observer represents an object that wants to be
       notified when the weather changes.


    2. WeatherStation

       This is the object whose state changes.

       It should contain:

           temperature

       and methods such as:

           setTemperature(...)
           registerObserver(...)
           removeObserver(...)
           notifyObservers()


    3. PhoneDisplay

    4. WindowDisplay

    5. StatisticsDisplay

       Each display should implement Observer.


The WeatherStation should NOT need to know about concrete
display classes.

It should only know about:

    Observer


EXPECTED USAGE:

    WeatherStation station = new WeatherStation();

    PhoneDisplay phone = new PhoneDisplay();
    WindowDisplay window = new WindowDisplay();
    StatisticsDisplay statistics = new StatisticsDisplay();

    station.registerObserver(phone);
    station.registerObserver(window);
    station.registerObserver(statistics);

    station.setTemperature(72);

    station.setTemperature(75);

    station.setTemperature(68);


EXPECTED BEHAVIOR:

When the temperature changes, every registered observer
should receive the new temperature.

For example:

    WeatherStation
         |
         | notify
         |
      +--+---------+----------+
      |            |          |
      v            v          v
    Phone        Window    Statistics
    Display      Display     Display


IMPORTANT:

WeatherStation should NOT do this:

    phone.update(...);
    window.update(...);
    statistics.update(...);


Instead, it should work with the Observer abstraction.

For example, conceptually:

    for (Observer observer : observers) {
        observer.update(...);
    }


QUESTIONS TO THINK ABOUT WHILE IMPLEMENTING:

1. Who is the Subject?

2. Who are the Observers?

3. What information does an Observer need when it is
   notified?

4. Should WeatherStation know about PhoneDisplay?

5. What happens if you add a new display?

6. Does WeatherStation need to change?

7. What happens if you remove an observer?

8. What happens if there are zero observers?

9. Who is responsible for maintaining the list of observers?

10. Why is this called a "one-to-many" relationship?

11. What happens if an observer is registered twice?

12. Should registering the same observer twice result in
    two notifications?


============================================================
FOLLOW-UP EXERCISE 2 — PUSH VS PULL
============================================================

Now change how your Observer system works.

Currently, WeatherStation might "push" the temperature
directly to the observers:

    observer.update(temperature);


This is called the PUSH approach.

Now implement the PULL approach.

Instead of giving the temperature directly to the Observer,
the WeatherStation should notify observers that something
changed.

The Observer can then ask the WeatherStation for the
information it needs.


For example, conceptually:

    observer.update();


Then the observer can do something like:

    weatherStation.getTemperature();


YOUR TASK:

Modify your design so that observers have access to the
WeatherStation and can pull the information they need.

For example:

    PhoneDisplay
        |
        | asks for
        v
    WeatherStation
        |
        v
    temperature


The Observer should no longer receive the temperature
directly from update().


EXPECTED USAGE:

    station.setTemperature(72);

The WeatherStation notifies all observers.

Each observer then retrieves whatever information it needs.


BONUS:

Add another piece of weather data:

    humidity

Now the WeatherStation contains:

    temperature
    humidity


Make different observers interested in different pieces
of information.

For example:

    PhoneDisplay
        -> temperature + humidity

    StatisticsDisplay
        -> temperature

    HumidityDisplay
        -> humidity


Think about which approach makes this easier:

    PUSH
    or
    PULL


EXTRA BONUS:

Add support for an observer to unsubscribe.

For example:

    station.removeObserver(phone);


After this:

    station.setTemperature(80);

The PhoneDisplay should no longer receive notifications,
while the remaining observers still should.


============================================================
FINAL REFLECTION
============================================================

After finishing both exercises, answer these in your own words:

1. What problem does the Observer pattern solve?

2. What is the Subject?

3. What is the Observer?

4. Why doesn't WeatherStation directly depend on
   PhoneDisplay?

5. What does "one-to-many dependency" mean?

6. What happens when a new Observer is added?

7. Does the Subject need to change when a new Observer
   implementation is created?

8. What is the difference between PUSH and PULL observers?

9. What are the advantages of PUSH?

10. What are the advantages of PULL?

11. What could happen if an Observer takes a very long time
    to process an update?

12. What could happen if an Observer throws an exception
    while the Subject is notifying observers?

13. Where might you see Observer in real software?

    Think about:

        - GUI events
        - Event listeners
        - News subscriptions
        - Stock price updates
        - Messaging systems
        - Application events

14. How is Observer different from Mediator?

15. How is Observer different from Chain of Responsibility?

16. What would happen if you had 10,000 observers?

17. What are some potential problems with having the Subject
    directly notify every Observer?

18. Give one real-world example where Observer makes sense.

19. Give one situation where Observer would probably be
    unnecessary complexity.


============================================================
*/
public class main {
}
