package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BevelModel;
import com.scell.model.drawingml.main.BevelPresetTypeValueModel;
import com.scell.model.drawingml.main.PositiveCoordinateValueModel;

public class BevelBuilder {
  private PositiveCoordinateValueModel h;

  private PositiveCoordinateValueModel w;

  private BevelPresetTypeValueModel prst;

  public BevelBuilder() {
  }

  public BevelBuilder setH(PositiveCoordinateValueModel h) {
    this.h = h;
    return this;
  }

  public BevelBuilder setW(PositiveCoordinateValueModel w) {
    this.w = w;
    return this;
  }

  public BevelBuilder setPrst(BevelPresetTypeValueModel prst) {
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
