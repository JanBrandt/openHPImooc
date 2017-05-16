package de.hpi.javaide.breakout;

/**
 * Objects that can change their state over time. E.g. color, position, size....
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public interface Updateable {
  /**
   * Make sure that objects that require to be changing their state, either
   * constantly or once in a while, provide an update method.
   */
  void update();
}