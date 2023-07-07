package de.mach.kata.gameoflife;

public class GameOfLifeImpl extends GameOfLife {

  /**
   * Constructs the game, initializing its internal structure for all cells. After the constructor
   * call, all other public methods should be accesible. After the constructor call, all cells
   * should be interpreted as {@link #DEAD_CELL}. Followup calls to {@link #setLivingCell(int, int)}
   * should register living cells.
   *
   * @param width the max x-axis count
   * @param height the max y-axis count
   */
  public GameOfLifeImpl(int width, int height) {
    super(width, height);
  }

  @Override
  public void setLivingCell(int x, int y) {}

  @Override
  public void computeNextGeneration() {}

  @Override
  public int getCell(int x, int y) throws IllegalArgumentException {
    return 0;
  }
}
