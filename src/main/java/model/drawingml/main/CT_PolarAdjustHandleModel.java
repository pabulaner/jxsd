package model.drawingml.main;

public class CT_PolarAdjustHandleModel {
  private final ST_GeomGuideNameModel gdRefAng;

  private final ST_GeomGuideNameModel gdRefR;

  private final ST_AdjAngleModel maxAng;

  private final ST_AdjAngleModel minAng;

  private final ST_AdjCoordinateModel maxR;

  private final ST_AdjCoordinateModel minR;

  private final CT_AdjPoint2DModel pos;

  public CT_PolarAdjustHandleModel(ST_GeomGuideNameModel gdRefAng, ST_GeomGuideNameModel gdRefR,
      ST_AdjAngleModel maxAng, ST_AdjAngleModel minAng, ST_AdjCoordinateModel maxR,
      ST_AdjCoordinateModel minR, CT_AdjPoint2DModel pos) {
    this.gdRefAng = gdRefAng;
    this.gdRefR = gdRefR;
    this.maxAng = maxAng;
    this.minAng = minAng;
    this.maxR = maxR;
    this.minR = minR;
    this.pos = pos;
  }

  public ST_GeomGuideNameModel getGdRefAng() {
    return this.gdRefAng;
  }

  public ST_GeomGuideNameModel getGdRefR() {
    return this.gdRefR;
  }

  public ST_AdjAngleModel getMaxAng() {
    return this.maxAng;
  }

  public ST_AdjAngleModel getMinAng() {
    return this.minAng;
  }

  public ST_AdjCoordinateModel getMaxR() {
    return this.maxR;
  }

  public ST_AdjCoordinateModel getMinR() {
    return this.minR;
  }

  public CT_AdjPoint2DModel getPos() {
    return this.pos;
  }
}
