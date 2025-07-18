package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_GeomRectModel;
import com.scell.model.drawingml.main.ST_AdjCoordinateModel;

public class CT_GeomRectBuilder {
  private ST_AdjCoordinateModel l;

  private ST_AdjCoordinateModel t;

  private ST_AdjCoordinateModel r;

  private ST_AdjCoordinateModel b;

  public CT_GeomRectBuilder() {
  }

  public CT_GeomRectBuilder setL(ST_AdjCoordinateModel l) {
    this.l = l;
    return this;
  }

  public CT_GeomRectBuilder setT(ST_AdjCoordinateModel t) {
    this.t = t;
    return this;
  }

  public CT_GeomRectBuilder setR(ST_AdjCoordinateModel r) {
    this.r = r;
    return this;
  }

  public CT_GeomRectBuilder setB(ST_AdjCoordinateModel b) {
    this.b = b;
    return this;
  }

  public CT_GeomRectModel build() {
    return new CT_GeomRectModel(this.l, this.t, this.r, this.b);
  }

  public CT_GeomRectBuilder from(CT_GeomRectModel value) {
    this.l = value.getL();
    this.t = value.getT();
    this.r = value.getR();
    this.b = value.getB();
    return this;
  }
}
