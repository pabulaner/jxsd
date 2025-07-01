package test.drawingml.main;

public class CTVector3DModel {
  private final STCoordinateModel dz;

  private final STCoordinateModel dy;

  private final STCoordinateModel dx;

  public CTVector3DModel(STCoordinateModel dz, STCoordinateModel dy, STCoordinateModel dx) {
    this.dz = dz;
    this.dy = dy;
    this.dx = dx;
  }

  public STCoordinateModel getDz() {
    return this.dz;
  }

  public STCoordinateModel getDy() {
    return this.dy;
  }

  public STCoordinateModel getDx() {
    return this.dx;
  }
}
