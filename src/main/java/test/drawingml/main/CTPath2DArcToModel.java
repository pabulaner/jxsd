package test.drawingml.main;

public class CTPath2DArcToModel {
  private final STAdjAngleModel stAng;

  private final STAdjAngleModel swAng;

  private final STAdjCoordinateModel wR;

  private final STAdjCoordinateModel hR;

  public CTPath2DArcToModel(STAdjAngleModel stAng, STAdjAngleModel swAng, STAdjCoordinateModel wR,
      STAdjCoordinateModel hR) {
    this.stAng = stAng;
    this.swAng = swAng;
    this.wR = wR;
    this.hR = hR;
  }

  public STAdjAngleModel getStAng() {
    return this.stAng;
  }

  public STAdjAngleModel getSwAng() {
    return this.swAng;
  }

  public STAdjCoordinateModel getWR() {
    return this.wR;
  }

  public STAdjCoordinateModel getHR() {
    return this.hR;
  }
}
