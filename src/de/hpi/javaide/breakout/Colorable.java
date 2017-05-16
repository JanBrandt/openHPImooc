package de.hpi.javaide.breakout;

/**
 * Interface for all objects that have some sort of color. Defines Getters for
 * the separate Red, Green, and Blue components of the RGB spectrum and a
 * combined Setter for all components.
 * 
 * @author Ralf Teusner and Tom Staubitz
 */
public interface Colorable {
  /**
   * Get the red portion of a color.
   * 
   * @return the red portion of a color as an int within the range of 0 and 255
   */
  int getR();

  /**
   * Get the green portion of a color.
   * 
   * @return the green portion of a color as an int within the range of 0 and
   *         255
   */
  int getG();

  /**
   * Get the blue portion of a color.
   * 
   * @return the blue portion of a color as an int within the range of 0 and 255
   */
  int getB();

  /**
   * Set a color defined by its red, green, and blue components.
   * 
   * @param r   the red component of the color.
   * @param g   the green component of the color
   * @param b   the blue component of the color
   */
  void setColor(int r, int g, int b);
}
