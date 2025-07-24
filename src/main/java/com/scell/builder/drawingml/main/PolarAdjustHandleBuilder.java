package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleModel;
import com.scell.model.drawingml.main.AdjCoordinateModel;
import com.scell.model.drawingml.main.AdjPoint2DModel;
import com.scell.model.drawingml.main.GeomGuideNameModel;
import com.scell.model.drawingml.main.PolarAdjustHandleModel;

public class PolarAdjustHandleBuilder {
  private GeomGuideNameModel gdRefAng;

  private GeomGuideNameModel gdRefR;

  private AdjAngleModel maxAng;

  private AdjAngleModel minAng;

  private AdjCoordinateModel maxR;

  private AdjCoordinateModel minR;

  private AdjPoint2DModel pos;

  public PolarAdjustHandleBuilder() {
  }

  public PolarAdjustHandleBuilder setGdRefAng(GeomGuideNameModel gdRefAng) {
    this.gdRefAng = gdRefAng;
    return this;
  }

  public PolarAdjustHandleBuilder setGdRefR(GeomGuideNameModel gdRefR) {
    this.gdRefR = gdRefR;
    return this;
  }

  public PolarAdjustHandleBuilder setMaxAng(AdjAngleModel maxAng) {
    this.maxAng = maxAng;
    return this;
  }

  public PolarAdjustHandleBuilder setMinAng(AdjAngleModel minAng) {
    this.minAng = minAng;
    return this;
  }

  public PolarAdjustHandleBuilder setMaxR(AdjCoordinateModel maxR) {
    this.maxR = maxR;
    return this;
  }

  public PolarAdjustHandleBuilder setMinR(AdjCoordinateModel minR) {
    this.minR = minR;
    return this;
  }

  public PolarAdjustHandleBuilder setPos(AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public PolarAdjustHandleModel build() {
    return new PolarAdjustHandleModel(this.gdRefAng, this.gdRefR, this.maxAng, this.minAng, this.maxR, this.minR, this.pos);
  }

  public PolarAdjustHandleBuilder from(PolarAdjustHandleModel value) {
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
