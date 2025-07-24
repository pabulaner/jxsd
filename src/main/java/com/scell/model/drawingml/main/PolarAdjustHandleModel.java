package com.scell.model.drawingml.main;

public class PolarAdjustHandleModel {
  private final GeomGuideNameModel gdRefAng;

  private final GeomGuideNameModel gdRefR;

  private final AdjAngleModel maxAng;

  private final AdjAngleModel minAng;

  private final AdjCoordinateModel maxR;

  private final AdjCoordinateModel minR;

  private final AdjPoint2DModel pos;

  public PolarAdjustHandleModel(GeomGuideNameModel gdRefAng, GeomGuideNameModel gdRefR,
      AdjAngleModel maxAng, AdjAngleModel minAng, AdjCoordinateModel maxR, AdjCoordinateModel minR,
      AdjPoint2DModel pos) {
    this.gdRefAng = gdRefAng;
    this.gdRefR = gdRefR;
    this.maxAng = maxAng;
    this.minAng = minAng;
    this.maxR = maxR;
    this.minR = minR;
    this.pos = pos;
  }

  public GeomGuideNameModel getGdRefAng() {
    return this.gdRefAng;
  }

  public GeomGuideNameModel getGdRefR() {
    return this.gdRefR;
  }

  public AdjAngleModel getMaxAng() {
    return this.maxAng;
  }

  public AdjAngleModel getMinAng() {
    return this.minAng;
  }

  public AdjCoordinateModel getMaxR() {
    return this.maxR;
  }

  public AdjCoordinateModel getMinR() {
    return this.minR;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
