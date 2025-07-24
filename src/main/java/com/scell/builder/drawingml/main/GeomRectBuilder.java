package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateModel;
import com.scell.model.drawingml.main.GeomRectModel;

public class GeomRectBuilder {
  private AdjCoordinateModel l;

  private AdjCoordinateModel t;

  private AdjCoordinateModel r;

  private AdjCoordinateModel b;

  public GeomRectBuilder() {
  }

  public GeomRectBuilder setL(AdjCoordinateModel l) {
    this.l = l;
    return this;
  }

  public GeomRectBuilder setT(AdjCoordinateModel t) {
    this.t = t;
    return this;
  }

  public GeomRectBuilder setR(AdjCoordinateModel r) {
    this.r = r;
    return this;
  }

  public GeomRectBuilder setB(AdjCoordinateModel b) {
    this.b = b;
    return this;
  }

  public GeomRectModel build() {
    return new GeomRectModel(this.l, this.t, this.r, this.b);
  }

  public GeomRectBuilder from(GeomRectModel value) {
    this.l = value.getL();
    this.t = value.getT();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }
}
