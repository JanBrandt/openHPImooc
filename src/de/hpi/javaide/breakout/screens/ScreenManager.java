package de.hpi.javaide.breakout.screens;

import de.hpi.javaide.breakout.starter.Game;

/**
 * Provides functionality to switch between the screens.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public class ScreenManager {

  private static Screen currentScreen;

  /**
   * The private constructor prohibits the instantiation of the class.
   */
  private ScreenManager() {
  }

  /**
   * Switch between the screens.
   * 
   * @param game
   *          Game a reference to access the Processing features
   * @param type
   *          String the type of screen to be switched to (StartScreen,
   *          GameScreen, EndScreen)
   */
  public static void setScreen(Game game, String type) {
    switch (type) {
      case Screen.START:
        currentScreen = StartScreen.getInstance(game);
        break;
      case Screen.GAME:
        currentScreen = GameScreen.getInstance(game);
        break;
      case Screen.END:
        currentScreen = EndScreen.getInstance(game);
        break;
    }
  }

  /**
   * Getter to access the currently active Screen.
   * 
   * @return Screen the currently active Screen
   */
  public static Screen getCurrentScreen() {
    return currentScreen;
  }

}
