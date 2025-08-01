package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateValueModel;
import com.scell.model.drawingml.main.AdjPoint2DModel;

public class AdjPoint2DBuilder {
  private AdjCoordinateValueModel y;

  private AdjCoordinateValueModel x;

  public AdjPoint2DBuilder() {
  }

  public AdjPoint2DBuilder setY(AdjCoordinateValueModel y) {
    this.y = y;
    return this;
  }

  public AdjPoint2DBuilder setX(AdjCoordinateValueModel x) {
    this.x = x;
    return this;
  }

  public AdjPoint2DModel build() {
    return new AdjPoint2DModel(this.y, this.x);
  }

  public AdjPoint2DBuilder from(AdjPoint2DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    return this;
  }
}
