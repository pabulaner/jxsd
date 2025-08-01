package com.scell.model.drawingml.main;

public class BevelModel {
  private final PositiveCoordinateValueModel h;

  private final PositiveCoordinateValueModel w;

  private final BevelPresetTypeValueModel prst;

  public BevelModel(PositiveCoordinateValueModel h, PositiveCoordinateValueModel w,
      BevelPresetTypeValueModel prst) {
    this.h = h;
    this.w = w;
    this.prst = prst;
  }

  public PositiveCoordinateValueModel getH() {
    return this.h;
  }

  public PositiveCoordinateValueModel getW() {
    return this.w;
  }

  public BevelPresetTypeValueModel getPrst() {
    return this.prst;
  }
}
