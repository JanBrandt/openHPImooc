package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.Measureable;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;
import java.util.LinkedList;


//TODO hier werden wir sicher eine Collection brauchen um die Bälle unterzubringen.
//     Irgendwie müssen die Bälle an den Start gebracht werden.
public class BallDepot implements Displayable, Measureable {
  private LinkedList<Ball> ballDepot;

  /**
   * Constructor for the ballDepot.
   * @param game Game provide access to the Processing features
   * @param numberOfBalls The number of ball to be in the depot
   */
  public BallDepot(Game game, int numberOfBalls) {
    this.ballDepot = new LinkedList<Ball>();
    for (int i = 0;i < numberOfBalls;i++) {
      Ball ball = new Ball(game, GameConstants.STARTPOSITION);
      ballDepot.add(ball);
    }
  }
  
  public int leftBalls() {
    return ballDepot.size();
  }

  public Ball dispense() {
    return ballDepot.removeFirst();
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
    return leftBalls() > 0;
  }

}
