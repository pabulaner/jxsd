package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_MarkerModel;
import com.scell.model.drawingml.chartDrawing.ST_MarkerCoordinateModel;

public class CT_MarkerBuilder {
  private ST_MarkerCoordinateModel x;

  private ST_MarkerCoordinateModel y;

  public CT_MarkerBuilder() {
  }

  public CT_MarkerBuilder setX(ST_MarkerCoordinateModel x) {
    this.x = x;
    return this;
  }

  public CT_MarkerBuilder setY(ST_MarkerCoordinateModel y) {
    this.y = y;
    return this;
  }

  public CT_MarkerModel build() {
    return new CT_MarkerModel(this.x, this.y);
  }

  public CT_MarkerBuilder from(CT_MarkerModel value) {
    this.x = value.getX();
    this.y = value.getY();
    return this;
  }
}
