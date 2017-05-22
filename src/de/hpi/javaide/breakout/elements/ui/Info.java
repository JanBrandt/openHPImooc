package de.hpi.javaide.breakout.elements.ui;

import de.hpi.javaide.breakout.basics.Font;
import de.hpi.javaide.breakout.basics.UIObject;
import de.hpi.javaide.breakout.starter.Game;

public class Info extends UIObject {

  private String content;

  public Info(Game game, String content) {
    super(game);
    this.content = content;
  }

  @Override
  public void display() {
    game.textFont(Font.getFont24());
    game.text(content, 100, 100);
  }

  @Override
  public void update(String input) {
    // nothing to do  
  }
}
