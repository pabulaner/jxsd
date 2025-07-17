package model.drawingml.main;

public class CT_Path2DArcToModel {
  private final ST_AdjAngleModel stAng;

  private final ST_AdjAngleModel swAng;

  private final ST_AdjCoordinateModel wR;

  private final ST_AdjCoordinateModel hR;

  public CT_Path2DArcToModel(ST_AdjAngleModel stAng, ST_AdjAngleModel swAng,
      ST_AdjCoordinateModel wR, ST_AdjCoordinateModel hR) {
    this.stAng = stAng;
    this.swAng = swAng;
    this.wR = wR;
    this.hR = hR;
  }

  public ST_AdjAngleModel getStAng() {
    return this.stAng;
  }

  public ST_AdjAngleModel getSwAng() {
    return this.swAng;
  }

  public ST_AdjCoordinateModel getWR() {
    return this.wR;
  }

  public ST_AdjCoordinateModel getHR() {
    return this.hR;
  }
}
