package de.hpi.javaide.breakout.screens;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.Initializable;
import de.hpi.javaide.breakout.Updateable;

/**
 * Provides a common interface for all Screen classes, so that we can easily
 * switch between the states of the Screen.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public interface Screen extends Initializable, Displayable, Updateable {
  String START = "start";
  String GAME = "game";
  String END = "end";

  String KEY_ENTER = "Enter key pressed";
  String KEY_SPACE = "Space key pressed";

  void handleKeyPressed(String key);

  void handleMouseDragged();

  void increaseScore(int amount);
  
  void ballLost();
}
