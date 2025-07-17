package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_Path2DArcToModel;
import com.scell.model.drawingml.main.ST_AdjAngleModel;
import com.scell.model.drawingml.main.ST_AdjCoordinateModel;

public class CT_Path2DArcToBuilder {
  private ST_AdjAngleModel stAng;

  private ST_AdjAngleModel swAng;

  private ST_AdjCoordinateModel wR;

  private ST_AdjCoordinateModel hR;

  public CT_Path2DArcToBuilder() {
  }

  public CT_Path2DArcToBuilder setStAng(ST_AdjAngleModel stAng) {
    this.stAng = stAng;
    return this;
  }

  public CT_Path2DArcToBuilder setSwAng(ST_AdjAngleModel swAng) {
    this.swAng = swAng;
    return this;
  }

  public CT_Path2DArcToBuilder setWR(ST_AdjCoordinateModel wR) {
    this.wR = wR;
    return this;
  }

  public CT_Path2DArcToBuilder setHR(ST_AdjCoordinateModel hR) {
    this.hR = hR;
    return this;
  }

  public CT_Path2DArcToModel build() {
    return new CT_Path2DArcToModel(this.stAng, this.swAng, this.wR, this.hR);
  }

  public CT_Path2DArcToBuilder from(CT_Path2DArcToModel value) {
    this.stAng = value.getStAng();
    this.swAng = value.getSwAng();
    this.wR = value.getWR();
    this.hR = value.getHR();
    return this;
  }
}
