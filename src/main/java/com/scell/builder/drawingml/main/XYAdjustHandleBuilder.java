package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjCoordinateModel;
import com.scell.model.drawingml.main.AdjPoint2DModel;
import com.scell.model.drawingml.main.GeomGuideNameModel;
import com.scell.model.drawingml.main.XYAdjustHandleModel;

public class XYAdjustHandleBuilder {
  private AdjCoordinateModel maxX;

  private GeomGuideNameModel gdRefY;

  private GeomGuideNameModel gdRefX;

  private AdjCoordinateModel maxY;

  private AdjCoordinateModel minY;

  private AdjCoordinateModel minX;

  private AdjPoint2DModel pos;

  public XYAdjustHandleBuilder() {
  }

  public XYAdjustHandleBuilder setMaxX(AdjCoordinateModel maxX) {
    this.maxX = maxX;
    return this;
  }

  public XYAdjustHandleBuilder setGdRefY(GeomGuideNameModel gdRefY) {
    this.gdRefY = gdRefY;
    return this;
  }

  public XYAdjustHandleBuilder setGdRefX(GeomGuideNameModel gdRefX) {
    this.gdRefX = gdRefX;
    return this;
  }

  public XYAdjustHandleBuilder setMaxY(AdjCoordinateModel maxY) {
    this.maxY = maxY;
    return this;
  }

  public XYAdjustHandleBuilder setMinY(AdjCoordinateModel minY) {
    this.minY = minY;
    return this;
  }

  public XYAdjustHandleBuilder setMinX(AdjCoordinateModel minX) {
    this.minX = minX;
    return this;
  }

  public XYAdjustHandleBuilder setPos(AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public XYAdjustHandleModel build() {
    return new XYAdjustHandleModel(this.maxX, this.gdRefY, this.gdRefX, this.maxY, this.minY, this.minX, this.pos);
  }

  public XYAdjustHandleBuilder from(XYAdjustHandleModel value) {
    this.maxX = value.getMaxX();
    this.gdRefY = value.getGdRefY();
    this.gdRefX = value.getGdRefX();
    this.maxY = value.getMaxY();
    this.minY = value.getMinY();
    this.minX = value.getMinX();
    this.pos = value.getPos();
    return this;
  }
}
