package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.basics.Rectangular;
import de.hpi.javaide.breakout.starter.Game;
import processing.core.PConstants;

import java.awt.Dimension;
import java.awt.Point;


//TODO wichtige Attribute: Größe, Position, Abstand der Bricks untereinander
//     Irgendwie muss ich herausbekommen ob der Stein noch existiert oder nicht.
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
    game.rectMode(PConstants.CENTER);
    game.stroke(150);
    game.fill(100);
    game.rect(getX(), getY(), getWidth(), getHeight());
  }
  
  

}
