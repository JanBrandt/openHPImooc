package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.Measureable;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;
import java.util.LinkedList;

public class BallDepot implements Displayable, Measureable {
  private LinkedList<Ball> ballDepot;

  /**
   * Constructor for the ballDepot.
   * 
   * @param game Game provide access to the Processing features
   * @param numberOfBalls The number of ball to be in the depot
   */
  public BallDepot(Game game, int numberOfBalls) {
    this.ballDepot = new LinkedList<Ball>();
    for (int i = 0; i < numberOfBalls; i++) {
      Ball ball = new Ball(game, GameConstants.STARTPOSITION);
      ballDepot.add(ball);
    }
  }

  public int leftBalls() {
    return ballDepot.size();
  }

  /**
   * Method to get a ball out of the depot, if the depot is not empty.
   * 
   * @return a Ball from the depot
   */
  public Ball dispense() {
    if (!isEmpty()) {
      return ballDepot.removeFirst();
    } else {
      return null;
    }
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
    return leftBalls() < 1;
  }

}
