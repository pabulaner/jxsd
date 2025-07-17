package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_Point2DModel;
import com.scell.model.drawingml.main.ST_CoordinateModel;

public class CT_Point2DBuilder {
  private ST_CoordinateModel y;

  private ST_CoordinateModel x;

  public CT_Point2DBuilder() {
  }

  public CT_Point2DBuilder setY(ST_CoordinateModel y) {
    this.y = y;
    return this;
  }

  public CT_Point2DBuilder setX(ST_CoordinateModel x) {
    this.x = x;
    return this;
  }

  public CT_Point2DModel build() {
    return new CT_Point2DModel(this.y, this.x);
  }

  public CT_Point2DBuilder from(CT_Point2DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    return this;
  }
}
