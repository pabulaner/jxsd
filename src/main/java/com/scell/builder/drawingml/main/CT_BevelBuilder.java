package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_BevelModel;
import com.scell.model.drawingml.main.ST_BevelPresetTypeModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;

public class CT_BevelBuilder {
  private ST_PositiveCoordinateModel h;

  private ST_PositiveCoordinateModel w;

  private ST_BevelPresetTypeModel prst;

  public CT_BevelBuilder() {
  }

  public CT_BevelBuilder setH(ST_PositiveCoordinateModel h) {
    this.h = h;
    return this;
  }

  public CT_BevelBuilder setW(ST_PositiveCoordinateModel w) {
    this.w = w;
    return this;
  }

  public CT_BevelBuilder setPrst(ST_BevelPresetTypeModel prst) {
    this.prst = prst;
    return this;
  }

  public CT_BevelModel build() {
    return new CT_BevelModel(this.h, this.w, this.prst);
  }

  public CT_BevelBuilder from(CT_BevelModel value) {
    this.h = value.getH();
    this.w = value.getW();
    this.prst = value.getPrst();
    return this;
  }
}
