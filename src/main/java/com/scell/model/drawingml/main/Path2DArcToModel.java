package com.scell.model.drawingml.main;

public class Path2DArcToModel {
  private final AdjAngleModel stAng;

  private final AdjAngleModel swAng;

  private final AdjCoordinateModel wR;

  private final AdjCoordinateModel hR;

  public Path2DArcToModel(AdjAngleModel stAng, AdjAngleModel swAng, AdjCoordinateModel wR,
      AdjCoordinateModel hR) {
    this.stAng = stAng;
    this.swAng = swAng;
    this.wR = wR;
    this.hR = hR;
  }

  public AdjAngleModel getStAng() {
    return this.stAng;
  }

  public AdjAngleModel getSwAng() {
    return this.swAng;
  }

  public AdjCoordinateModel getWR() {
    return this.wR;
  }

  public AdjCoordinateModel getHR() {
    return this.hR;
  }
}
