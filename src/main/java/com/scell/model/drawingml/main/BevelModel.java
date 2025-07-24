package com.scell.model.drawingml.main;

public class BevelModel {
  private final PositiveCoordinateModel h;

  private final PositiveCoordinateModel w;

  private final BevelPresetTypeModel prst;

  public BevelModel(PositiveCoordinateModel h, PositiveCoordinateModel w,
      BevelPresetTypeModel prst) {
    this.h = h;
    this.w = w;
    this.prst = prst;
  }

  public PositiveCoordinateModel getH() {
    return this.h;
  }

  public PositiveCoordinateModel getW() {
    return this.w;
  }

  public BevelPresetTypeModel getPrst() {
    return this.prst;
  }
}
