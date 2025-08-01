package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateValueModel;
import com.scell.model.drawingml.main.GeomRectModel;

public class GeomRectBuilder {
  private AdjCoordinateValueModel l;

  private AdjCoordinateValueModel t;

  private AdjCoordinateValueModel r;

  private AdjCoordinateValueModel b;

  public GeomRectBuilder() {
  }

  public GeomRectBuilder setL(AdjCoordinateValueModel l) {
    this.l = l;
    return this;
  }

  public GeomRectBuilder setT(AdjCoordinateValueModel t) {
    this.t = t;
    return this;
  }

  public GeomRectBuilder setR(AdjCoordinateValueModel r) {
    this.r = r;
    return this;
  }

  public GeomRectBuilder setB(AdjCoordinateValueModel b) {
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
