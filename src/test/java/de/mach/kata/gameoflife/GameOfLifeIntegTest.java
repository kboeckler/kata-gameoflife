package de.mach.kata.gameoflife;

import org.junit.jupiter.api.Test;

public class GameOfLifeIntegTest {

  @Test
  public void testGlider() {
    GameOfLife game = new GameOfLifeImpl(20, 20);
    game.setLivingCell(0, 0);
    game.setLivingCell(2, 0);
    game.setLivingCell(1, 1);
    game.setLivingCell(2, 1);
    game.setLivingCell(1, 2);
    for (int i = 0; i < 11; i++) {
      System.out.println("===== Round " + i + " =====");
      System.out.println(new Renderer().render(game));
      System.out.println();
      game.computeNextGeneration();
    }
  }

  @Test
  public void testBlock() {
    GameOfLife game = new GameOfLifeImpl(20, 20);
    game.setLivingCell(1, 1);
    game.setLivingCell(1, 2);
    game.setLivingCell(2, 1);
    game.setLivingCell(2, 2);
    for (int i = 0; i < 11; i++) {
      System.out.println("===== Round " + i + " =====");
      System.out.println(new Renderer().render(game));
      System.out.println();
      game.computeNextGeneration();
    }
  }
}
