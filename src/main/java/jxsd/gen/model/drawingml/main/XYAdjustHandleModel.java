package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.XYAdjustHandleBuilder;

/**
 * This is a generated sequence class.
 */
public class XYAdjustHandleModel {
  private final AdjCoordinateValueModel maxX;

  private final String gdRefY;

  private final String gdRefX;

  private final AdjCoordinateValueModel maxY;

  private final AdjCoordinateValueModel minY;

  private final AdjCoordinateValueModel minX;

  private final AdjPoint2DModel pos;

  public XYAdjustHandleModel(AdjCoordinateValueModel maxX, String gdRefY, String gdRefX,
      AdjCoordinateValueModel maxY, AdjCoordinateValueModel minY, AdjCoordinateValueModel minX,
      AdjPoint2DModel pos) {
    this.maxX = maxX;
    this.gdRefY = gdRefY;
    this.gdRefX = gdRefX;
    this.maxY = maxY;
    this.minY = minY;
    this.minX = minX;
    this.pos = pos;
  }

  public XYAdjustHandleBuilder builder() {
    return new XYAdjustHandleBuilder().from(this);
  }

  public AdjCoordinateValueModel getMaxX() {
    return this.maxX;
  }

  public String getGdRefY() {
    return this.gdRefY;
  }

  public String getGdRefX() {
    return this.gdRefX;
  }

  public AdjCoordinateValueModel getMaxY() {
    return this.maxY;
  }

  public AdjCoordinateValueModel getMinY() {
    return this.minY;
  }

  public AdjCoordinateValueModel getMinX() {
    return this.minX;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
