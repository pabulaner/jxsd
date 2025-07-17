package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveSize2DModel;
import com.scell.model.drawingml.main.ST_PositiveCoordinateModel;

public class CT_PositiveSize2DBuilder {
  private ST_PositiveCoordinateModel cy;

  private ST_PositiveCoordinateModel cx;

  public CT_PositiveSize2DBuilder() {
  }

  public CT_PositiveSize2DBuilder setCy(ST_PositiveCoordinateModel cy) {
    this.cy = cy;
    return this;
  }

  public CT_PositiveSize2DBuilder setCx(ST_PositiveCoordinateModel cx) {
    this.cx = cx;
    return this;
  }

  public CT_PositiveSize2DModel build() {
    return new CT_PositiveSize2DModel(this.cy, this.cx);
  }

  public CT_PositiveSize2DBuilder from(CT_PositiveSize2DModel value) {
    this.cy = value.getCy();
    this.cx = value.getCx();
    return this;
  }
}
