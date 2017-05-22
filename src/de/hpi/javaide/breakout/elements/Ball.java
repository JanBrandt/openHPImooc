package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.basics.Elliptic;
import de.hpi.javaide.breakout.basics.Vector;
import de.hpi.javaide.breakout.starter.Game;
import java.awt.Dimension;
import java.awt.Point;
import processing.core.PConstants;

/**
 * Blueprint for a Ball.
 *
 * @author Ralf Teusner and Tom Staubitz
 *
 */

public class Ball extends Elliptic {
  
  private double speed;
  private Vector direction;

  /**
   * Constructor for the ball. Sets speed to 1.
   * @param game Game provide access to the Processing features
   * @param position Startposition of the ball
   */
  public Ball(final Game game, final Point position) {
    super(game, position, new Dimension(15, 15));
    speed = 10;
    direction = new Vector(0, 1);
  }

  /**
   * Method to move the ball according to speed and direction.
   */
  public void move() {
    int newX = (int) Math.round(position.getX() + speed * direction.getX());
    int newY = (int) Math.round(position.getY() + speed * direction.getY());
    update(new Point(newX, newY), dimension);
  }

  @Override
  public void display() {
    game.ellipseMode(PConstants.CENTER);
    game.fill(170,0,170);
    game.noStroke();
    game.ellipse(getX(), getY(), getWidth(), getHeight());
  }

  public void bounceX() {
    direction.setX(-direction.getX());   
  }

  public void bounceY() {
    direction.setY(-direction.getY());   
  }

  /**
   * Method to compute the new direction and speed of the ball after hitting the paddle.
   * @param paddle The paddle hitting the ball
   */
  public void bounceOffPaddle(Paddle paddle) {
    // TODO Speedchange of the ball
    //this.speed = paddle.getSpeed();
    direction = new Vector((getX() - paddle.getX()) * 10, - getY());
    direction.normalize();
  }

  public int getUpperBoundary() {
    return getY() - getHeight() / 2;
  }
  
  public int getLowerBoundary() {
    return getY() + getHeight() / 2;
  }
  
  public int getLeftBoundary() {
    return getX() - getWidth() / 2;
  }
  
  public int getRightBoundary() {
    return getX() + getWidth() / 2;
  }
}
