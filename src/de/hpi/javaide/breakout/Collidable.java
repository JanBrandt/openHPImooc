package de.hpi.javaide.breakout;

import java.awt.Dimension;
import java.awt.Point;
import java.awt.Shape;

/**
 * Interface for objects that might collide. Can set their internal state
 * (position, dimension) via update and return their geometry as a @Shape
 * object.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public interface Collidable extends Measureable {
  /**
   * Combined setter for position and dimension.
   * 
   * @param position
   *          Position, consisting of x and y values.
   * @param dimension
   *          Dimension representing width and height.
   */
  void update(Point position, Dimension dimension);

  /**
   * Getter for the geometry behind a collidable object on the screen The
   * geometry behind a collidable object is defined by a java.awt.Shape. In our
   * case probably a Rectangle or an Ellipse.
   * 
   * @return the Shape that defines the geometry behind a collidable object.
   */
  Shape getGeometry();
}