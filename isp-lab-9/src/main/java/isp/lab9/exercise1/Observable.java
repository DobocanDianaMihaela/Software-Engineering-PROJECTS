package isp.lab9.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<isp.lab9.exercise1.Observer> observers = new ArrayList<isp.lab9.exercise1.Observer>();

    public void changeState(Object event) {
        notifyAllObservers(event);
    }

    public void register(isp.lab9.exercise1.Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers(Object event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }
}
