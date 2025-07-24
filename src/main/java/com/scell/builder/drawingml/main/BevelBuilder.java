package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BevelModel;
import com.scell.model.drawingml.main.BevelPresetTypeModel;
import com.scell.model.drawingml.main.PositiveCoordinateModel;

public class BevelBuilder {
  private PositiveCoordinateModel h;

  private PositiveCoordinateModel w;

  private BevelPresetTypeModel prst;

  public BevelBuilder() {
  }

  public BevelBuilder setH(PositiveCoordinateModel h) {
    this.h = h;
    return this;
  }

  public BevelBuilder setW(PositiveCoordinateModel w) {
    this.w = w;
    return this;
  }

  public BevelBuilder setPrst(BevelPresetTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public BevelModel build() {
    return new BevelModel(this.h, this.w, this.prst);
  }

  public BevelBuilder from(BevelModel value) {
    this.h = value.getH();
    this.w = value.getW();
    this.prst = value.getPrst();
    return this;
  }
}
