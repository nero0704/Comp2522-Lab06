package org.bcit.comp2522.labs.lab06;

import processing.core.PVector;

public class Player extends AbstractObservable {

  PVector position;
  float radius = 10;
  private boolean isUse = false;

  private static Player player = new Player();

  private Player() {
    position = new PVector(300, 300);
  }

  public static Player getInstance() {
    return player;
  }

  public void move() {

  }

  public void draw(Window window) {
    window.fill(123, 12, 23);
    window.ellipse(position.x, position.y, radius, radius);
  }

  @Override
  void registerObserver(AbstractObserver observer) {

  }

  @Override
  void unregisterObserver(AbstractObserver observer) {

  }

  @Override
  void notifyObservers() {

  }
}
