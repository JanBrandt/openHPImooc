package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.Displayable;
import de.hpi.javaide.breakout.starter.Game;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Blueprint for the Wall.
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
// TODO die Wall wird aus Bricks gebaut.
public class Wall implements Displayable, Iterable<Brick> {

  /**
   * Datastructure to keep the Bricks.
   */
  private ArrayList<Brick> wall;

  public Wall(Game game, int i, int j) {
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

  }

  @Override
  public void display() {
    // TODO Auto-generated method stub
    
  }
}
