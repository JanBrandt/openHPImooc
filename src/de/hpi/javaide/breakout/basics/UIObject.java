package de.hpi.javaide.breakout.basics;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.starter.Game;

/**
 * Provides a common basis for non-collidable user interface objects, such as a
 * high score, etc.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public abstract class UIObject implements Displayable {

  /**
   * The reference to the Game that provides access to the Processing methods.
   */
  protected Game game;

  /**
   * Constructor to pass the Game reference to the new UIobject.
   * 
   * @param game Game provide access to the Processing features
   */
  public UIObject(Game game) {
    this.game = game;
  }

  /**
   * Method to update the contents of a UIObject.
   * 
   * @param input
   *          String the new content of the UIObject
   */
  public abstract void update(String input);
}
