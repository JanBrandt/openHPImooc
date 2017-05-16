package de.hpi.javaide.breakout.basics;

import de.hpi.javaide.breakout.starter.Game;
import processing.core.PFont;

/**
 * Creates some Fonts in different sizes and make them easily available. Adapter
 * to the PFont class as offered by Processing
 * 
 * @author Ralf Teusner and Tom Staubitz
 *
 */
public class Font {
  private static PFont font16;
  private static PFont font24;
  private static PFont font32;

  private Font() {
  }

  /**
   * @param game Game provide access to the Processing features.
   */
  public static void init(Game game) {
    font16 = game.createFont("Arial Black Standard", 16);
    font24 = game.createFont("Arial Black Standard", 24);
    font32 = game.createFont("Arial Black Standard", 32);
  }

  public static PFont getFont16() {
    return font16;
  }

  public static PFont getFont24() {
    return font24;
  }

  public static PFont getFont32() {
    return font32;
  }
}
