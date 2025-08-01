package com.scell.model.drawingml.chartDrawing;

public class MarkerModel {
  private final MarkerCoordinateValueModel x;

  private final MarkerCoordinateValueModel y;

  public MarkerModel(MarkerCoordinateValueModel x, MarkerCoordinateValueModel y) {
    this.x = x;
    this.y = y;
  }

  public MarkerCoordinateValueModel getX() {
    return this.x;
  }

  public MarkerCoordinateValueModel getY() {
    return this.y;
  }
}
