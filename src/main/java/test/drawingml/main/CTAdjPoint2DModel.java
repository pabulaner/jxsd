package test.drawingml.main;

public class CTAdjPoint2DModel {
  private final STAdjCoordinateModel y;

  private final STAdjCoordinateModel x;

  public CTAdjPoint2DModel(STAdjCoordinateModel y, STAdjCoordinateModel x) {
    this.y = y;
    this.x = x;
  }

  public STAdjCoordinateModel getY() {
    return this.y;
  }

  public STAdjCoordinateModel getX() {
    return this.x;
  }
}
