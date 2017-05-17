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
  

  public Brick(Game game, Point position, Dimension dimension) {
    super(game, position, dimension);
    // TODO Auto-generated constructor stub
    hits = 3;
  }

  @Override
  public void display() {
    game.rectMode(PConstants.CENTER);
    game.stroke(150);
    game.fill(getR(), getG(), getB());
    game.rect(getX(), getY(), getWidth(), getHeight());
  }
  
  

}
