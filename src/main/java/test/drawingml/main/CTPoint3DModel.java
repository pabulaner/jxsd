package test.drawingml.main;

public class CTPoint3DModel {
  private final STCoordinateModel y;

  private final STCoordinateModel x;

  private final STCoordinateModel z;

  public CTPoint3DModel(STCoordinateModel y, STCoordinateModel x, STCoordinateModel z) {
    this.y = y;
    this.x = x;
    this.z = z;
  }

  public STCoordinateModel getY() {
    return this.y;
  }

  public STCoordinateModel getX() {
    return this.x;
  }

  public STCoordinateModel getZ() {
    return this.z;
  }
}
