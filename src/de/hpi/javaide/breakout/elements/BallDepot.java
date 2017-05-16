package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.Measureable;
import de.hpi.javaide.breakout.starter.Game;

//TODO hier werden wir sicher eine Collection brauchen um die Bälle unterzubringen.
//     Vermutlich werden wir wissen wollen wann das Depot leer ist.
//     Irgendwie müssen die Bälle an den Start gebracht werden.
public class BallDepot implements Displayable, Measureable {

  public BallDepot(Game game) {
    // TODO Auto-generated constructor stub
  }

  public Ball dispense() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getX() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getY() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getWidth() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public int getHeight() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    
  }

  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

}
