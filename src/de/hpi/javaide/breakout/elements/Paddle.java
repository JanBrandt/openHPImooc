package de.hpi.javaide.breakout.elements;

import de.hpi.javaide.breakout.basics.Rectangular;
import de.hpi.javaide.breakout.starter.Game;
import java.awt.Dimension;
import java.awt.Point;
import processing.core.PConstants;

/**
 * Create the paddle.
 *
 * @param game Game provide access to the Processing features
 */
public class Paddle extends Rectangular {
  public Paddle(final Game game) {
    super(game, new Point(game.width / 2, game.height - 20), new Dimension(100, 20));
    setColor(150, 150, 150);
  }

  @Override
  public final void display() {
    game.rectMode(PConstants.CENTER);
    game.noStroke();
    game.fill(getR(), getG(), getB());
    game.rect(getX(), getY(), getWidth(), getHeight());
  }

  public final void move() {
    update(new Point(game.mouseX, getY()), new Dimension(getWidth(), getHeight()));
  }
}
