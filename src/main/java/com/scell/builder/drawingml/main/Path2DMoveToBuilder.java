package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjPoint2DModel;
import com.scell.model.drawingml.main.Path2DMoveToModel;

public class Path2DMoveToBuilder {
  private AdjPoint2DModel pt;

  public Path2DMoveToBuilder() {
  }

  public Path2DMoveToBuilder setPt(AdjPoint2DModel pt) {
    this.pt = pt;
    return this;
  }

  public Path2DMoveToModel build() {
    return new Path2DMoveToModel(this.pt);
  }

  public Path2DMoveToBuilder from(Path2DMoveToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
