package com.scell.model.drawingml.main;

public class CT_BevelModel {
  private final ST_PositiveCoordinateModel h;

  private final ST_PositiveCoordinateModel w;

  private final ST_BevelPresetTypeModel prst;

  public CT_BevelModel(ST_PositiveCoordinateModel h, ST_PositiveCoordinateModel w,
      ST_BevelPresetTypeModel prst) {
    this.h = h;
    this.w = w;
    this.prst = prst;
  }

  public ST_PositiveCoordinateModel getH() {
    return this.h;
  }

  public ST_PositiveCoordinateModel getW() {
    return this.w;
  }

  public ST_BevelPresetTypeModel getPrst() {
    return this.prst;
  }
}
