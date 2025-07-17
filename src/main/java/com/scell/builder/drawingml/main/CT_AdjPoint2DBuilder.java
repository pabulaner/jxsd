package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.ST_AdjCoordinateModel;

public class CT_AdjPoint2DBuilder {
  private ST_AdjCoordinateModel y;

  private ST_AdjCoordinateModel x;

  public CT_AdjPoint2DBuilder() {
  }

  public CT_AdjPoint2DBuilder setY(ST_AdjCoordinateModel y) {
    this.y = y;
    return this;
  }

  public CT_AdjPoint2DBuilder setX(ST_AdjCoordinateModel x) {
    this.x = x;
    return this;
  }

  public CT_AdjPoint2DModel build() {
    return new CT_AdjPoint2DModel(this.y, this.x);
  }

  public CT_AdjPoint2DBuilder from(CT_AdjPoint2DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    return this;
  }
}
