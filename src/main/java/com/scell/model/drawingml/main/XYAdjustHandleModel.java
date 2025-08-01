package com.scell.model.drawingml.main;

public class XYAdjustHandleModel {
  private final AdjCoordinateValueModel maxX;

  private final GeomGuideNameValueModel gdRefY;

  private final GeomGuideNameValueModel gdRefX;

  private final AdjCoordinateValueModel maxY;

  private final AdjCoordinateValueModel minY;

  private final AdjCoordinateValueModel minX;

  private final AdjPoint2DModel pos;

  public XYAdjustHandleModel(AdjCoordinateValueModel maxX, GeomGuideNameValueModel gdRefY,
      GeomGuideNameValueModel gdRefX, AdjCoordinateValueModel maxY, AdjCoordinateValueModel minY,
      AdjCoordinateValueModel minX, AdjPoint2DModel pos) {
    this.maxX = maxX;
    this.gdRefY = gdRefY;
    this.gdRefX = gdRefX;
    this.maxY = maxY;
    this.minY = minY;
    this.minX = minX;
    this.pos = pos;
  }

  public AdjCoordinateValueModel getMaxX() {
    return this.maxX;
  }

  public GeomGuideNameValueModel getGdRefY() {
    return this.gdRefY;
  }

  public GeomGuideNameValueModel getGdRefX() {
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
