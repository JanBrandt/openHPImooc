package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.screens.ScreenManager;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;

public final class CollisionLogic {
  /**
   * The constructor of this class is private to make sure that it is only used
   * as a static class. - it cannot be instantiated, - it cannot hold a state, -
   * it contains only static methods
   */
  private CollisionLogic() {
  }

  /**
   * This method provides a way to determine if the ball collides with any of
   * the collidable elements on the screen. Paddle, Bricks, ...
   * 
   * @param game Game provide access to the Processing features
   * @param ball The actual ball in game
   * @param paddle The paddle controlled by the player
   * @param wall The wall of bricks
   */
  public static void checkCollision(final Game game, final Ball ball, final Paddle paddle,
                                    final Wall wall) {
    if (collideWithSide(game, ball)) {
      ball.bounceX();
    } else if (collideWithTop(game, ball)) {
      ball.bounceY();
    } else if (leaveScreen(game, ball)) {
      ScreenManager.getCurrentScreen().ballLost();
    }
    collideWithPaddle(game, ball, paddle);
    collideWithWall(game, ball, wall);
  }
  
  private static boolean leaveScreen(Game game, Ball ball) {
    return ball.lowerBounderyBall() > GameConstants.SCREEN_Y;
  }

  private static void collideWithWall(Game game, Ball ball, Wall wall) {
    for (Brick brick : wall) {
      collideWithBrick(game, ball, brick);
    }
  }

  private static void collideWithBrick(Game game, Ball ball, Brick brick) {
    // TODO Auto-generated method stub
    
  }

  private static void collideWithPaddle(Game game, Ball ball, Paddle paddle) {
    if (ball.lowerBounderyBall() > paddle.getY() - paddle.getHeight() / 2) {
      if (ball.getX() > paddle.getLeftBoundary() && ball.getX() < paddle.getRightBoundary()) {
        ball.bounceOffPaddle(paddle);
      }
    }
  }

  private static boolean collideWithSide(final Game game, final Ball ball) {
    boolean collideRightSide = ball.rightBounderyBall() > GameConstants.SCREEN_X;
    boolean collideLeftSide = ball.leftBounderyBall() < 0;
    return collideLeftSide || collideRightSide;
  }

  private static boolean collideWithTop(final Game game, final Ball ball) {
    return ball.upperBounderyBall() < 0;
  }
}
