package de.hpi.javaide.breakout.elements.ui;

import de.hpi.javaide.breakout.basics.Font;
import de.hpi.javaide.breakout.basics.UIObject;
import de.hpi.javaide.breakout.starter.Game;

//TODO nach dem die fehlenden Methoden ergänzt wurden, muss hier noch ein Konstruktorparameter 
//     an das zugehörige Attribut übergeben werden.

public class Info extends UIObject {

  private String content;

  public Info(Game game, String content) {
    super(game);
  }

  @Override
  public void display() {
    game.textFont(Font.getFont24());

  }

  @Override
  public void update(String input) {
    // TODO Auto-generated method stub
    
  }
}
