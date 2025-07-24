package com.scell.model.drawingml.main;

public class XYAdjustHandleModel {
  private final AdjCoordinateModel maxX;

  private final GeomGuideNameModel gdRefY;

  private final GeomGuideNameModel gdRefX;

  private final AdjCoordinateModel maxY;

  private final AdjCoordinateModel minY;

  private final AdjCoordinateModel minX;

  private final AdjPoint2DModel pos;

  public XYAdjustHandleModel(AdjCoordinateModel maxX, GeomGuideNameModel gdRefY,
      GeomGuideNameModel gdRefX, AdjCoordinateModel maxY, AdjCoordinateModel minY,
      AdjCoordinateModel minX, AdjPoint2DModel pos) {
    this.maxX = maxX;
    this.gdRefY = gdRefY;
    this.gdRefX = gdRefX;
    this.maxY = maxY;
    this.minY = minY;
    this.minX = minX;
    this.pos = pos;
  }

  public AdjCoordinateModel getMaxX() {
    return this.maxX;
  }

  public GeomGuideNameModel getGdRefY() {
    return this.gdRefY;
  }

  public GeomGuideNameModel getGdRefX() {
    return this.gdRefX;
  }

  public AdjCoordinateModel getMaxY() {
    return this.maxY;
  }

  public AdjCoordinateModel getMinY() {
    return this.minY;
  }

  public AdjCoordinateModel getMinX() {
    return this.minX;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
