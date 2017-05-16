package de.hpi.javaide.breakout;

/**
 * Measureable objects that have a position (x,y) as well as a width and an
 * height.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public interface Measureable {

  /**
   * Make sure that measurable objects provide a way to get their x-position.
   * 
   * @return the x-position as an integer
   */

  int getX();

  /**
   * Make sure that measurable objects provide a way to get their y-position.
   * 
   * @return the y-position as an integer
   */
  int getY();

  /**
   * Make sure that measurable objects provide a way to get their width.
   * 
   * @return the width as an integer
   */
  int getWidth();

  /**
   * Make sure that measurable objects provide a way to get their height.
   * 
   * @return the height as an integer
   */
  int getHeight();
}