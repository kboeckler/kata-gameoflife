package de.mach.kata.gameoflife;

import java.util.Arrays;

/** Created by fabricejeannet on 16/09/2014. */
public class GameOfLifeStub extends GameOfLife {

  private final int[][] grid;

  public GameOfLifeStub(int rowCount, int columnCount) {
    super(columnCount, rowCount);
    grid = new int[rowCount][columnCount];
    initializeGridWithDeadCells();
  }

  private void initializeGridWithDeadCells() {
    for (int y = 0; y < this.rowCount; y++) {
      Arrays.fill(grid[y], DEAD_CELL);
    }
  }

  @Override
  public void setLivingCell(int x, int y) {
    grid[y][x] = LIVING_CELL;
  }

  private boolean isInTheGrid(int row, int col) {
    return row >= 0 && col >= 0 && row < rowCount && col < columnCount;
  }

  @Override
  public void computeNextGeneration() {}

  @Override
  public int getCell(int x, int y) throws IllegalArgumentException {
    if (!isInTheGrid(y, x)) {
      throw new IllegalArgumentException("Not in the grid: " + x + " " + y);
    }
    return grid[y][x];
  }
}
