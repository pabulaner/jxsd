package test.drawingml.main;

public class CTPoint2DModel {
  private final STCoordinateModel y;

  private final STCoordinateModel x;

  public CTPoint2DModel(STCoordinateModel y, STCoordinateModel x) {
    this.y = y;
    this.x = x;
  }

  public STCoordinateModel getY() {
    return this.y;
  }

  public STCoordinateModel getX() {
    return this.x;
  }
}
