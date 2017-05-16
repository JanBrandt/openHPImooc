package de.hpi.javaide.breakout;

/**
 * Interface for all objects that can be displayed on the screen. This can be
 * e.g. collidable objects or interface elements
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public interface Displayable {
  /**
   * Make sure that objects that are meant to be displayed, have a display()
   * method.
   */
  void display();
}
