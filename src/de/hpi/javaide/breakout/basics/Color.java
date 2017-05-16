package de.hpi.javaide.breakout.basics;

import de.hpi.javaide.breakout.Colorable;

public class Color implements Colorable {

  /**
   * the components of the color.
   */
  private int rot;
  private int gelb; 
  private int blau;

  /**
   * default constructor to create a black color.
   */
  public Color() {
    rot = 0;
    gelb = 0;
    blau = 0;
  }

  /**
   * Constructor to create a color with the specified values.
   *
   * @param r   red portion of the color 0-255
   * @param g   green portion of the color 0-255
   * @param b   blue portion of the color 0-255
   */
  public Color(int r, int g, int b) {
    this.rot = r;
    this.gelb = g;
    this.blau = b;
  }

  @Override
  public int getR() {
    return rot;
  }

  /**
   * Set the red component.
   * 
   * @param r
   *            int 0-255
   */
  public void setR(int r) {
    this.rot = r;
  }

  @Override
  public int getG() {
    return gelb;
  }

  /**
   * Set the green component.
   *
   * @param g
   *            int 0-255
   */
  public void setG(int g) {
    this.gelb = g;
  }

  @Override
  public int getB() {
    return blau;
  }

  /**
   * Set the blue components.
   *
   * @param b
   *            int 0-255
   */
  public void setB(int b) {
    this.blau = b;
  }

  @Override
  public void setColor(int r, int g, int b) {
    setR(r);
    setG(g);
    setB(b);
  }
}