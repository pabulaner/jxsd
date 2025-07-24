package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjPoint2DModel;
import com.scell.model.drawingml.main.Path2DQuadBezierToModel;
import java.util.List;

public class Path2DQuadBezierToBuilder {
  private List<AdjPoint2DModel> pt;

  public Path2DQuadBezierToBuilder() {
  }

  public Path2DQuadBezierToBuilder setPt(List<AdjPoint2DModel> pt) {
    this.pt = pt;
    return this;
  }

  public Path2DQuadBezierToModel build() {
    return new Path2DQuadBezierToModel(this.pt);
  }

  public Path2DQuadBezierToBuilder from(Path2DQuadBezierToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
