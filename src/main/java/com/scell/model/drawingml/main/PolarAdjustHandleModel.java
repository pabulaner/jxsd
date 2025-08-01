package com.scell.model.drawingml.main;

public class PolarAdjustHandleModel {
  private final GeomGuideNameValueModel gdRefAng;

  private final GeomGuideNameValueModel gdRefR;

  private final AdjAngleValueModel maxAng;

  private final AdjAngleValueModel minAng;

  private final AdjCoordinateValueModel maxR;

  private final AdjCoordinateValueModel minR;

  private final AdjPoint2DModel pos;

  public PolarAdjustHandleModel(GeomGuideNameValueModel gdRefAng, GeomGuideNameValueModel gdRefR,
      AdjAngleValueModel maxAng, AdjAngleValueModel minAng, AdjCoordinateValueModel maxR,
      AdjCoordinateValueModel minR, AdjPoint2DModel pos) {
    this.gdRefAng = gdRefAng;
    this.gdRefR = gdRefR;
    this.maxAng = maxAng;
    this.minAng = minAng;
    this.maxR = maxR;
    this.minR = minR;
    this.pos = pos;
  }

  public GeomGuideNameValueModel getGdRefAng() {
    return this.gdRefAng;
  }

  public GeomGuideNameValueModel getGdRefR() {
    return this.gdRefR;
  }

  public AdjAngleValueModel getMaxAng() {
    return this.maxAng;
  }

  public AdjAngleValueModel getMinAng() {
    return this.minAng;
  }

  public AdjCoordinateValueModel getMaxR() {
    return this.maxR;
  }

  public AdjCoordinateValueModel getMinR() {
    return this.minR;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
