package de.mach.kata.gameoflife;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class RendererTest {

  @Test
  public void render_emptyGame2x2() {
    assertThat(new Renderer().render(new GameOfLifeStub(2, 2))).isEqualTo("..\n..");
  }

  @Test
  public void render_emptyGame2x3() {
    assertThat(new Renderer().render(new GameOfLifeStub(3, 2))).isEqualTo("..\n..\n..");
  }

  @Test
  public void render_fullAlive2x2() {
    GameOfLife game = new GameOfLifeStub(2, 2);
    game.setLivingCell(0, 0);
    game.setLivingCell(1, 0);
    game.setLivingCell(0, 1);
    game.setLivingCell(1, 1);
    assertThat(new Renderer().render(game)).isEqualTo("##\n##");
  }
}
