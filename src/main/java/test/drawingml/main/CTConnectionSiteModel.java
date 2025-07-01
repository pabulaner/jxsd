package test.drawingml.main;

public class CTConnectionSiteModel {
  private final STAdjAngleModel ang;

  private final CTAdjPoint2DModel pos;

  public CTConnectionSiteModel(STAdjAngleModel ang, CTAdjPoint2DModel pos) {
    this.ang = ang;
    this.pos = pos;
  }

  public STAdjAngleModel getAng() {
    return this.ang;
  }

  public CTAdjPoint2DModel getPos() {
    return this.pos;
  }
}
