package de.mach.kata.gameoflife;

public abstract class GameOfLife {

  public static final int DEAD_CELL = 0;
  public static final int LIVING_CELL = 1;

  protected int rowCount;

  protected int columnCount;

  /**
   * Constructs the game, initializing its internal structure for all cells. After the constructor
   * call, all other public methods should be accesible. After the constructor call, all cells
   * should be interpreted as {@link #DEAD_CELL}. Followup calls to {@link #setLivingCell(int, int)}
   * should register living cells.
   *
   * @param width  the max x-axis count
   * @param height the max y-axis count
   */
  public GameOfLife(int width, int height) {
    this.rowCount = height;
    this.columnCount = width;
  }

  public int getRowCount() {
    return rowCount;
  }

  public int getColumnCount() {
    return columnCount;
  }

  /**
   * Mutates the state of one specific cell to {@link #LIVING_CELL}. Although this can be called
   * anytime, this should be used after calling the constructor to set up cells, which are alive.
   */
  public abstract void setLivingCell(int x, int y);

  /**
   * Computes one generation. This method is intended to change its internal state of cells dead or
   * alive.
   */
  public abstract void computeNextGeneration();

  /**
   * Returns either {@link #DEAD_CELL} or {@link #LIVING_CELL}. Throws exception, if cell is not
   * found.
   *
   * @param x the column coordinate
   * @param y the row coordinate
   * @return {@code 0} or {@code 1} for dead or alive
   * @throws IllegalArgumentException if the coordinates are invalid, so that no cell could be
   *     determined
   */
  public abstract int getCell(int x, int y) throws IllegalArgumentException;
}
