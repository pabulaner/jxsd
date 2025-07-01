package test.drawingml.chartDrawing;

public class CTMarkerModel {
  private final STMarkerCoordinateModel x;

  private final STMarkerCoordinateModel y;

  public CTMarkerModel(STMarkerCoordinateModel x, STMarkerCoordinateModel y) {
    this.x = x;
    this.y = y;
  }

  public STMarkerCoordinateModel getX() {
    return this.x;
  }

  public STMarkerCoordinateModel getY() {
    return this.y;
  }
}
