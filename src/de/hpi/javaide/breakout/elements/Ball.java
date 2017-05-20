package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.basics.Elliptic;
import de.hpi.javaide.breakout.basics.Vector;
import de.hpi.javaide.breakout.starter.Game;
import java.awt.Dimension;
import java.awt.Point;



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
  
  private int speed;
  private Vector vector;

  public Ball(final Game game, final Point position) {
    super(game, position, new Dimension(10, 10));
    speed = 1;
    vector.setX(0);
    vector.setY(1);
  }

  public void move() {
    int newX = (int) Math.round(position.getX() + speed * vector.getX());
    int newY = (int) Math.round(position.getY() + speed * vector.getY());
    update(new Point(newX, newY), dimension);
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    
  }
}
