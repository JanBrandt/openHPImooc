package de.hpi.javaide.breakout.basics;

import de.hpi.javaide.breakout.Collidable;
import de.hpi.javaide.breakout.Colorable;
import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.starter.Game;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Shape;

/**
 * Base class to build collidable objects from. Provides the required basis for
 * Elliptics and Rectangulars
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public abstract class CollisionObject implements Collidable, Displayable, Colorable {

  /**
   * the geometrical Shape that defines the form of the object.
   */
  protected Shape geometry;
  /**
   * a reference to the game class to provide access to the processing methods.
   */
  protected Game game;
  /**
   * width and height of the object.
   */
  protected Dimension dimension;
  /**
   * the x,y position of an object.
   */
  protected Point position;
  /**
   * the color of the object.
   */
  private Color color;

  /**
   * Constructor. Initializes the reference to the Game, the size and the
   * position of the object
   * 
   * @param game
   *          Game, access to the Processing features
   * @param position
   *          Position, the x,y coordinates
   * @param dimension
   *          Dimension, the width and height of the object
   */
  public CollisionObject(final Game game, final Point position, final Dimension dimension) {
    this.game = game;
    this.position = position;
    this.dimension = dimension;
    this.color = new Color(255, 255, 255);
  }

  @Override
  public final int getWidth() {
    return dimension.width;
  }

  @Override
  public final int getHeight() {
    return dimension.height;
  }

  @Override
  public final int getX() {
    return position.x;
  }

  @Override
  public final int getY() {
    return position.y;
  }

  @Override
  public final int getR() {
    return color.getR();
  }

  @Override
  public final int getG() {
    return color.getG();
  }

  @Override
  public final int getB() {
    return color.getB();
  }

  @Override
  public final void setColor(final int r, final int g, final int b) {
    this.color = new Color(r, g, b);
  }

  @Override
  public final Shape getGeometry() {
    return this.geometry;
  }

  @Override
  public void update(final Point position, final Dimension dimension) {
    this.position = position;
    this.dimension = dimension;
  }
}
