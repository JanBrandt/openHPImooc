package de.hpi.javaide.breakout.starter;

import java.awt.Point;

public interface GameConstants {
  final int LIVES = 3;
  final int NUMBER_OF_BRICKROWS = 6;
  final int NUMBER_OF_BRICKCOLUMNS = 7;
  final int SCREEN_X = 800;
  final int SCREEN_Y = 600;
  final Point STARTPOSITION = new Point(SCREEN_X / 2, SCREEN_Y / 2);
  final int framerate = 60;
}
