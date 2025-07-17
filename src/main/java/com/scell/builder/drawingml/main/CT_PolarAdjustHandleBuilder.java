package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_PolarAdjustHandleModel;
import com.scell.model.drawingml.main.ST_AdjAngleModel;
import com.scell.model.drawingml.main.ST_AdjCoordinateModel;
import com.scell.model.drawingml.main.ST_GeomGuideNameModel;

public class CT_PolarAdjustHandleBuilder {
  private ST_GeomGuideNameModel gdRefAng;

  private ST_GeomGuideNameModel gdRefR;

  private ST_AdjAngleModel maxAng;

  private ST_AdjAngleModel minAng;

  private ST_AdjCoordinateModel maxR;

  private ST_AdjCoordinateModel minR;

  private CT_AdjPoint2DModel pos;

  public CT_PolarAdjustHandleBuilder() {
  }

  public CT_PolarAdjustHandleBuilder setGdRefAng(ST_GeomGuideNameModel gdRefAng) {
    this.gdRefAng = gdRefAng;
    return this;
  }

  public CT_PolarAdjustHandleBuilder setGdRefR(ST_GeomGuideNameModel gdRefR) {
    this.gdRefR = gdRefR;
    return this;
  }

  public CT_PolarAdjustHandleBuilder setMaxAng(ST_AdjAngleModel maxAng) {
    this.maxAng = maxAng;
    return this;
  }

  public CT_PolarAdjustHandleBuilder setMinAng(ST_AdjAngleModel minAng) {
    this.minAng = minAng;
    return this;
  }

  public CT_PolarAdjustHandleBuilder setMaxR(ST_AdjCoordinateModel maxR) {
    this.maxR = maxR;
    return this;
  }

  public CT_PolarAdjustHandleBuilder setMinR(ST_AdjCoordinateModel minR) {
    this.minR = minR;
    return this;
  }

  public CT_PolarAdjustHandleBuilder setPos(CT_AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public CT_PolarAdjustHandleModel build() {
    return new CT_PolarAdjustHandleModel(this.gdRefAng, this.gdRefR, this.maxAng, this.minAng, this.maxR, this.minR, this.pos);
  }

  public CT_PolarAdjustHandleBuilder from(CT_PolarAdjustHandleModel value) {
    this.gdRefAng = value.getGdRefAng();
    this.gdRefR = value.getGdRefR();
    this.maxAng = value.getMaxAng();
    this.minAng = value.getMinAng();
    this.maxR = value.getMaxR();
    this.minR = value.getMinR();
    this.pos = value.getPos();
    return this;
  }
}
