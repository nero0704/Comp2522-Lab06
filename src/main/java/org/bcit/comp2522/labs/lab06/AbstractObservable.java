package org.bcit.comp2522.labs.lab06;

import java.util.ArrayList;

public abstract class AbstractObservable {
  ArrayList<AbstractObserver> observers;
  abstract void registerObserver(AbstractObserver observer);
  abstract void unregisterObserver(AbstractObserver observer);
  abstract void notifyObservers();
}
