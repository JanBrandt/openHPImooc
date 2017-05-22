package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;

//TODO den Fehler unten haben wir absichtlich eingebaut, um zu zeigen, 
// dass hier noch was getan werden muss.
//     Hier sollen alle Kollisionen geprüft werden. Trifft der Ball das Paddle.
//     Für jeden Stein in der Mauer: wurde er getroffen?
//     Erreicht der Ball den Spielfeld Rand.
//     Tipp: Schleifen könnten sich als hilfreich erweisen.
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
    } else if (collideWithPaddle(game, ball, paddle)) {
      ball.bounceOffPaddle(paddle);
    }
    
    // TODO
  }
  
  private static boolean collideWithPaddle(Game game, Ball ball, Paddle paddle) {
    boolean hitPaddle = false;
    if (ball.lowerBounderyBall() > paddle.getY() - paddle.getHeight() / 2) {
      if (ball.getX()> paddle.getLeftBoundary() && ball.getX() < paddle.getRightBoundary()) {
        hitPaddle = true;
      }
    }
    return hitPaddle;
  }

  private static boolean collideWithSide(final Game game, final Ball ball) {
    boolean collideRightSide = ball.rightBounderyBall() > GameConstants.SCREEN_X;
    boolean collideLeftSide = ball.leftBounderyBall() < 0;
    return collideLeftSide || collideRightSide;
  }

  private static boolean collideWithTop(final Game game, final Ball ball) {
    boolean upperCollide = ball.upperBounderyBall() < 0;
    boolean lowerCollide = ball.lowerBounderyBall() > GameConstants.SCREEN_Y;
    return upperCollide || lowerCollide;
  }
}
