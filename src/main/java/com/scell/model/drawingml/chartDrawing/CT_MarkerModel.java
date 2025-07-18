package com.scell.model.drawingml.chartDrawing;

public class CT_MarkerModel {
  private final ST_MarkerCoordinateModel x;

  private final ST_MarkerCoordinateModel y;

  public CT_MarkerModel(ST_MarkerCoordinateModel x, ST_MarkerCoordinateModel y) {
    this.x = x;
    this.y = y;
  }

  public ST_MarkerCoordinateModel getX() {
    return this.x;
  }

  public ST_MarkerCoordinateModel getY() {
    return this.y;
  }
}
