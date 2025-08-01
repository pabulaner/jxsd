package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;
import com.scell.model.drawingml.main.Point2DModel;

public class Point2DBuilder {
  private CoordinateValueModel y;

  private CoordinateValueModel x;

  public Point2DBuilder() {
  }

  public Point2DBuilder setY(CoordinateValueModel y) {
    this.y = y;
    return this;
  }

  public Point2DBuilder setX(CoordinateValueModel x) {
    this.x = x;
    return this;
  }

  public Point2DModel build() {
    return new Point2DModel(this.y, this.x);
  }

  public Point2DBuilder from(Point2DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    return this;
  }
}
