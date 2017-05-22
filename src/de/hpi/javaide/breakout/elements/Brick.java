package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.basics.Rectangular;
import de.hpi.javaide.breakout.starter.Game;
import java.awt.Dimension;
import java.awt.Point;
import processing.core.PConstants;

public class Brick extends Rectangular {
  private int hits;

  /**
   * Create a brick.
   * @param game Game provide access to the Processing features
   * @param position Position of the brick
   * @param dimension Size of the brick
   */
  public Brick(Game game, Point position, Dimension dimension) {
    super(game, position, dimension);
    hits = 3;
    setColor(150, 150, 150);
  }

  @Override
  public void display() {
    if (isAlive()) {
      game.rectMode(PConstants.CENTER);
      game.stroke(150);
      game.fill(100);
      game.rect(getX(), getY(), getWidth(), getHeight());
    }
  }

  public int rightBoundary() {
    return getX() + getWidth() / 2;
  }
  
  public int leftBoundary() {
    return getX() - getWidth() / 2;
  }
  
  public int lowerBoundary() {
    return getY() + getHeight() / 2;
  }
  
  public int upperBoundary() {
    return getY() - getHeight() / 2;
  }

  public void isHit() {
    hits--;
  }
  
  public boolean isAlive() {
    return hits > 0;
  }

}
