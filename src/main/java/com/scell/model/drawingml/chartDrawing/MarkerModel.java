package com.scell.model.drawingml.chartDrawing;

public class MarkerModel {
  private final MarkerCoordinateModel x;

  private final MarkerCoordinateModel y;

  public MarkerModel(MarkerCoordinateModel x, MarkerCoordinateModel y) {
    this.x = x;
    this.y = y;
  }

  public MarkerCoordinateModel getX() {
    return this.x;
  }

  public MarkerCoordinateModel getY() {
    return this.y;
  }
}
