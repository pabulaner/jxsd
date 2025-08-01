package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.MarkerCoordinateValueModel;
import com.scell.model.drawingml.chartDrawing.MarkerModel;

public class MarkerBuilder {
  private MarkerCoordinateValueModel x;

  private MarkerCoordinateValueModel y;

  public MarkerBuilder() {
  }

  public MarkerBuilder setX(MarkerCoordinateValueModel x) {
    this.x = x;
    return this;
  }

  public MarkerBuilder setY(MarkerCoordinateValueModel y) {
    this.y = y;
    return this;
  }

  public MarkerModel build() {
    return new MarkerModel(this.x, this.y);
  }

  public MarkerBuilder from(MarkerModel value) {
    this.x = value.getX();
    this.y = value.getY();
    return this;
  }
}
