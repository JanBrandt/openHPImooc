package de.hpi.javaide.breakout.elements.ui;

import de.hpi.javaide.breakout.basics.Font;
import de.hpi.javaide.breakout.basics.UIObject;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;

public class Timer extends UIObject {

  private int seconds;
  private int updateCounter;

  /**
   * Constructor of the timer.
   * @param game Game provide access to the Processing features
   */
  public Timer(Game game) {
    super(game);
    seconds = 60;
    updateCounter = 0;
  }

  @Override
  public void display() {
    game.fill(255);
    game.textFont(Font.getFont16());
    game.text("Time left: " + seconds, game.width - 150, game.height - 80);
  }

  @Override
  public void update(String input) {
    updateCounter++;
    if (updateCounter > GameConstants.framerate) {
      seconds--;
      updateCounter = 0;
    }
    // TODO Some action after counter gets to zero
  }
}
