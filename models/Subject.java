package models;

import java.util.ArrayList;

//Subject class for observer pattern
public abstract class Subject
{
    //Reference the observers
    ArrayList<Observer> observers = new ArrayList();

    //Add an observer
    public void attach(Observer o) {
        this.observers.add(o);
    }

    //Remove an observer
    public void dettach(Observer o) {
        this.observers.remove(o);
    }

    //Update the observers
    public void Notify() {
        for (Observer o : observers) {
            o.update();
        }
    }

}