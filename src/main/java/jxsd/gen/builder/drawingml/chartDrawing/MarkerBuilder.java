package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.MarkerModel;

/**
 * This is a generated sequence class.
 */
public class MarkerBuilder {
  private double x;

  private double y;

  public MarkerBuilder() {
  }

  public MarkerBuilder setX(double x) {
    this.x = x;
    return this;
  }

  public MarkerBuilder setY(double y) {
    this.y = y;
    return this;
  }

  public MarkerBuilder from(MarkerModel value) {
    this.x = value.getX();
    this.y = value.getY();
    return this;
  }

  public MarkerModel build() {
    return new MarkerModel(this.x, this.y);
  }
}
