package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveCoordinateModel;
import com.scell.model.drawingml.main.PositiveSize2DModel;

public class PositiveSize2DBuilder {
  private PositiveCoordinateModel cy;

  private PositiveCoordinateModel cx;

  public PositiveSize2DBuilder() {
  }

  public PositiveSize2DBuilder setCy(PositiveCoordinateModel cy) {
    this.cy = cy;
    return this;
  }

  public PositiveSize2DBuilder setCx(PositiveCoordinateModel cx) {
    this.cx = cx;
    return this;
  }

  public PositiveSize2DModel build() {
    return new PositiveSize2DModel(this.cy, this.cx);
  }

  public PositiveSize2DBuilder from(PositiveSize2DModel value) {
    this.cy = value.getCy();
    this.cx = value.getCx();
    return this;
  }
}
