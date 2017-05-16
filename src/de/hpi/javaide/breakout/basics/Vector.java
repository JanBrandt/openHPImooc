package de.hpi.javaide.breakout.basics;

import processing.core.PVector;

/**
 * Adapter to Processing's PVector.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public class Vector {

  /**
   * The PVector object to be wrapped.
   */
  private PVector vector;

  /**
   * Constructor to set the x and the y value of the Vector.
   * 
   * @param x
   *          float
   * @param y
   *          float
   */
  public Vector(float x, float y) {
    vector = new PVector(x, y);
  }

  public float getX() {
    return vector.x;
  }

  public float getY() {
    return vector.y;
  }

  public void setX(float x) {
    vector.x = x;
  }

  public void setY(float y) {
    vector.y = y;
  }

  /**
   * Multiply the given Vector with the given number.
   * 
   * @param n The factor to multiply the Vector with
   */
  public void mult(float n) {
    vector.mult(n);
  }

  /**
   * Normalize the wrapped vector.
   */
  public void normalize() {
    vector.normalize();
  }

}
