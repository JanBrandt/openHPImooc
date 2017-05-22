package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.Measureable;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;
import java.awt.Dimension;
import java.awt.Point;
import java.util.LinkedList;
import processing.core.PConstants;

public class BallDepot implements Displayable, Measureable {
  private LinkedList<Ball> ballDepot;
  /**
   * width and height of the object.
   */
  private Dimension dimension;
  /**
   * the x,y position of an object.
   */
  private Point position;
  private Game game;
  
  /**
   * Constructor for the ballDepot.
   * 
   * @param game Game provide access to the Processing features
   * @param numberOfBalls The number of ball to be in the depot
   */
  public BallDepot(Game game, int numberOfBalls) {
    this.ballDepot = new LinkedList<Ball>();
    for (int i = 0; i < numberOfBalls; i++) {
      Ball ball = new Ball(game, GameConstants.STARTPOSITION);
      ballDepot.add(ball);
    }
    int depotSize = numberOfBalls * 30 + 20;
    position = new Point(GameConstants.SCREEN_X - depotSize - 10, 10);
    dimension = new Dimension(depotSize, 40);
    this.game = game;
  }

  public int leftBalls() {
    return ballDepot.size();
  }

  /**
   * Method to get a ball out of the depot, if the depot is not empty.
   * 
   * @return a Ball from the depot
   */
  public Ball dispense() {
    if (!isEmpty()) {
      return ballDepot.removeFirst();
    } else {
      return null;
    }
  }

  @Override
  public int getX() {
    return position.x;
  }

  @Override
  public int getY() {
    return position.y;
  }

  @Override
  public int getWidth() {
    return dimension.width;
  }

  @Override
  public int getHeight() {
    return dimension.height;
  }

  @Override
  public void display() {
    game.rectMode(PConstants.CORNER);
    game.stroke(200);
    game.strokeWeight(2);
    game.fill(0);
    game.rect(getX(), getY(), getWidth(), getHeight());
    for (int i = 0; i < ballDepot.size();i++) {
      game.ellipseMode(PConstants.CORNER);
      game.fill(170,0,170);
      game.noStroke();
      game.ellipse(position.x + 10 + i * 30, 15 , 30 , 30);
    }
  }

  public boolean isEmpty() {
    return leftBalls() < 1;
  }

}
