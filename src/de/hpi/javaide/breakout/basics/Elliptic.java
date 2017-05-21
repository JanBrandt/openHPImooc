package de.hpi.javaide.breakout.basics;

import de.hpi.javaide.breakout.starter.Game;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.geom.Ellipse2D;

/**
 * Extends the CollisionObject to provide the basis for the round collidable
 * Elements, such as the Ball.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public abstract class Elliptic extends CollisionObject {

  /**
   * Constructor to create the basis for a round object.
   * @param game Reference to the game that provides access to the Processing features
   * @param position Position x,y position of the Object
   * @param dimension The dimension of the elliptic object
   */
  public Elliptic(Game game, Point position, Dimension dimension) {
    super(game, position, dimension);
    geometry = new Ellipse2D.Float(getX(), getY(), getWidth(), getHeight());
  }

  /**
   * Default constructor to create a round object with a size 10,10 at the top
   * left corner of the screen.
   * 
   * @param game Game provide access to the Processing featuress
   */
  public Elliptic(Game game) {
    this(game, new Point(0, 0), new Dimension(10, 10));
  }

  @Override
  public void update(Point position, Dimension dimension) {
    super.update(position, dimension);
    ((Ellipse2D) this.getGeometry()).setFrame(getX(), getY(), getWidth(), getHeight());
  }
}
