package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.MarkerBuilder;

/**
 * This is a generated sequence class.
 */
public class MarkerModel {
  private final double x;

  private final double y;

  public MarkerModel(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public MarkerBuilder builder() {
    return new MarkerBuilder().from(this);
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }
}
