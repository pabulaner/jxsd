package com.scell.model.drawingml.main;

public class PositiveSize2DModel {
  private final PositiveCoordinateValueModel cy;

  private final PositiveCoordinateValueModel cx;

  public PositiveSize2DModel(PositiveCoordinateValueModel cy, PositiveCoordinateValueModel cx) {
    this.cy = cy;
    this.cx = cx;
  }

  public PositiveCoordinateValueModel getCy() {
    return this.cy;
  }

  public PositiveCoordinateValueModel getCx() {
    return this.cx;
  }
}
