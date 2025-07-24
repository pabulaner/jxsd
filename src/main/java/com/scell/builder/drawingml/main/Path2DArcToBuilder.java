package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleModel;
import com.scell.model.drawingml.main.AdjCoordinateModel;
import com.scell.model.drawingml.main.Path2DArcToModel;

public class Path2DArcToBuilder {
  private AdjAngleModel stAng;

  private AdjAngleModel swAng;

  private AdjCoordinateModel wR;

  private AdjCoordinateModel hR;

  public Path2DArcToBuilder() {
  }

  public Path2DArcToBuilder setStAng(AdjAngleModel stAng) {
    this.stAng = stAng;
    return this;
  }

  public Path2DArcToBuilder setSwAng(AdjAngleModel swAng) {
    this.swAng = swAng;
    return this;
  }

  public Path2DArcToBuilder setWR(AdjCoordinateModel wR) {
    this.wR = wR;
    return this;
  }

  public Path2DArcToBuilder setHR(AdjCoordinateModel hR) {
    this.hR = hR;
    return this;
  }

  public Path2DArcToModel build() {
    return new Path2DArcToModel(this.stAng, this.swAng, this.wR, this.hR);
  }

  public Path2DArcToBuilder from(Path2DArcToModel value) {
    this.stAng = value.getStAng();
    this.swAng = value.getSwAng();
    this.wR = value.getWR();
    this.hR = value.getHR();
    return this;
  }
}
