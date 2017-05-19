package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.starter.Game;
import de.hpi.javaide.breakout.starter.GameConstants;

import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Blueprint for the Wall.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */

public class Wall implements Displayable, Iterable<Brick> {

  /**
   * Datastructure to keep the Bricks.
   */
  private ArrayList<Brick> wall;

  public Wall(Game game, int i, int j) {
    wall = new ArrayList<Brick>();
    buildWall(game, i ,j);
  }

  @Override
  public Iterator<Brick> iterator() {
    return wall.iterator();
  }

  /**
   * Build the wall by putting the single bricks into their position Hint: You
   * might want to use one or two for-loops.
   * 
   * @param game Game provide access to the Processing features
   * @param columns Number of columns to create in the wall
   * @param rows Number of rows to create in the wall
   */
  private void buildWall(Game game, int columns, int rows) {
    // TODO schönere Wall
    final int height = GameConstants.SCREEN_X / (3 * rows);
    final int width = (int) Math.round(GameConstants.SCREEN_Y * 0.9 / columns);
    final int distanceBetweenBricks = 7;
    for (int i = 0 ; i < columns;i++) {
      for (int j = 0; j < rows;j++) {
        Point point = new Point((j + 1) * (distanceBetweenBricks + width),
                                (i + 1) * (height + distanceBetweenBricks));
        Brick brick = new Brick(game, point, new Dimension(width,height));
        wall.add(brick);
      }
    }
  }

  @Override
  public void display() {
    for (Brick brick : wall) {
      brick.display();
    }
  }
}
