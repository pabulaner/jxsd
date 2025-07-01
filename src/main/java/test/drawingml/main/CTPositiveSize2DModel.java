package test.drawingml.main;

public class CTPositiveSize2DModel {
  private final STPositiveCoordinateModel cy;

  private final STPositiveCoordinateModel cx;

  public CTPositiveSize2DModel(STPositiveCoordinateModel cy, STPositiveCoordinateModel cx) {
    this.cy = cy;
    this.cx = cx;
  }

  public STPositiveCoordinateModel getCy() {
    return this.cy;
  }

  public STPositiveCoordinateModel getCx() {
    return this.cx;
  }
}
