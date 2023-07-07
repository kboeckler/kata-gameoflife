package de.mach.kata.gameoflife;

public class Renderer {

  public String render(GameOfLife game) {
    StringBuilder sb = new StringBuilder();
    for (int y = 0; y < game.getRowCount(); y++) {
      if (sb.length() > 0) {
        sb.append("\n");
      }
      for (int x = 0; x < game.getColumnCount(); x++) {
        sb.append(convert(game.getCell(x, y)));
      }
    }
    return sb.toString();
  }

  private String convert(int cellValue) {
    switch (cellValue) {
      case 0:
        return ".";
      case 1:
        return "#";
      default:
        throw new IllegalArgumentException("Unknown call value: " + cellValue);
    }
  }
}
