package test.drawingml.main;

public class CTGeomRectModel {
  private final STAdjCoordinateModel l;

  private final STAdjCoordinateModel t;

  private final STAdjCoordinateModel r;

  private final STAdjCoordinateModel b;

  public CTGeomRectModel(STAdjCoordinateModel l, STAdjCoordinateModel t, STAdjCoordinateModel r,
      STAdjCoordinateModel b) {
    this.l = l;
    this.t = t;
    this.r = r;
    this.b = b;
  }

  public STAdjCoordinateModel getL() {
    return this.l;
  }

  public STAdjCoordinateModel getT() {
    return this.t;
  }

  public STAdjCoordinateModel getR() {
    return this.r;
  }

  public STAdjCoordinateModel getB() {
    return this.b;
  }
}
