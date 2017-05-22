package de.hpi.javaide.breakout.elements.ui;

import de.hpi.javaide.breakout.basics.UIObject;
import de.hpi.javaide.breakout.starter.Game;

public class Score extends UIObject {

  private int score;

  public Score(Game game) {
    super(game);
    score = 0;
  }

  @Override
  public void display() {
    // TODO Display the score
  }

  @Override
  public void update(String input) {
    // TODO Update the score 
  }
}
