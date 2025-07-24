package com.scell.model.drawingml.main;

public class PositiveSize2DModel {
  private final PositiveCoordinateModel cy;

  private final PositiveCoordinateModel cx;

  public PositiveSize2DModel(PositiveCoordinateModel cy, PositiveCoordinateModel cx) {
    this.cy = cy;
    this.cx = cx;
  }

  public PositiveCoordinateModel getCy() {
    return this.cy;
  }

  public PositiveCoordinateModel getCx() {
    return this.cx;
  }
}
