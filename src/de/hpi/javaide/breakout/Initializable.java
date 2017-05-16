package de.hpi.javaide.breakout;

/**
 * An interface that provides all objects that need to be initialized with an
 * initial state with an init() method.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public interface Initializable {
  /**
   * Make sure that objects that require an initial state, provide an init()
   * method.
   */
  void init();
}