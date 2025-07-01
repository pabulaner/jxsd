package test.drawingml.main;

public class CTPolarAdjustHandleModel {
  private final STGeomGuideNameModel gdRefAng;

  private final STGeomGuideNameModel gdRefR;

  private final STAdjAngleModel maxAng;

  private final STAdjAngleModel minAng;

  private final STAdjCoordinateModel maxR;

  private final STAdjCoordinateModel minR;

  private final CTAdjPoint2DModel pos;

  public CTPolarAdjustHandleModel(STGeomGuideNameModel gdRefAng, STGeomGuideNameModel gdRefR,
      STAdjAngleModel maxAng, STAdjAngleModel minAng, STAdjCoordinateModel maxR,
      STAdjCoordinateModel minR, CTAdjPoint2DModel pos) {
    this.gdRefAng = gdRefAng;
    this.gdRefR = gdRefR;
    this.maxAng = maxAng;
    this.minAng = minAng;
    this.maxR = maxR;
    this.minR = minR;
    this.pos = pos;
  }

  public STGeomGuideNameModel getGdRefAng() {
    return this.gdRefAng;
  }

  public STGeomGuideNameModel getGdRefR() {
    return this.gdRefR;
  }

  public STAdjAngleModel getMaxAng() {
    return this.maxAng;
  }

  public STAdjAngleModel getMinAng() {
    return this.minAng;
  }

  public STAdjCoordinateModel getMaxR() {
    return this.maxR;
  }

  public STAdjCoordinateModel getMinR() {
    return this.minR;
  }

  public CTAdjPoint2DModel getPos() {
    return this.pos;
  }
}
