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
// TODO neben dem Ergänzen der vom Interface erwarteten Methoden,
// sollte der Ball Eigenschaften wie Größe und Richtung mitbringen.
// Richtung wird in der Regel als Vector definiert.
// Vermutlich sollte er die Richtung ändern können und sehr wahrscheinlich wird
// früher oder später
// jemand wissen wollen in welche Richtung er fliegt.
public class Ball extends Elliptic {
  
  private double speed;
  private Vector direction;

  /**
   * Constructor for the ball. Sets speed to 1.
   * @param game Game provide access to the Processing features
   * @param position Startposition of the ball
   */
  public Ball(final Game game, final Point position) {
    super(game, position, new Dimension(10, 10));
    speed = 10;
    direction = new Vector(0, 1);
  }

  public void move() {
    int newX = (int) Math.round(position.getX() + speed * direction.getX());
    int newY = (int) Math.round(position.getY() + speed * direction.getY());
    update(new Point(newX, newY), dimension);
  }

  @Override
  public void display() {
    game.ellipseMode(PConstants.CENTER);
    game.fill(200);
    game.noStroke();
    game.ellipse(getX(), getY(), getWidth(), getHeight());
  }

  public void bounceX() {
    direction.setX(-direction.getX());   
  }

  public void bounceY() {
    direction.setY(-direction.getY());   
  }

  public void bounceOffPaddle(Paddle paddle) {
    // TODO Geschwindigkeitveränderung des Balles
    //this.speed = paddle.getSpeed();
    direction = new Vector((getX() - paddle.getX()) * 10, - getY());
    direction.normalize();
  }

  public int upperBounderyBall() {
    return getY() - getHeight() / 2;
  }
  
  public int lowerBounderyBall() {
    return getY() + getHeight() / 2;
  }
  
  public int leftBounderyBall() {
    return getX() - getWidth() / 2;
  }
  
  public int rightBounderyBall() {
    return getX() + getWidth() / 2;
  }
}
