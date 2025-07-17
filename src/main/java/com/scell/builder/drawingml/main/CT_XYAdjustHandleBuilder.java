package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_XYAdjustHandleModel;
import com.scell.model.drawingml.main.ST_AdjCoordinateModel;
import com.scell.model.drawingml.main.ST_GeomGuideNameModel;

public class CT_XYAdjustHandleBuilder {
  private ST_AdjCoordinateModel maxX;

  private ST_GeomGuideNameModel gdRefY;

  private ST_GeomGuideNameModel gdRefX;

  private ST_AdjCoordinateModel maxY;

  private ST_AdjCoordinateModel minY;

  private ST_AdjCoordinateModel minX;

  private CT_AdjPoint2DModel pos;

  public CT_XYAdjustHandleBuilder() {
  }

  public CT_XYAdjustHandleBuilder setMaxX(ST_AdjCoordinateModel maxX) {
    this.maxX = maxX;
    return this;
  }

  public CT_XYAdjustHandleBuilder setGdRefY(ST_GeomGuideNameModel gdRefY) {
    this.gdRefY = gdRefY;
    return this;
  }

  public CT_XYAdjustHandleBuilder setGdRefX(ST_GeomGuideNameModel gdRefX) {
    this.gdRefX = gdRefX;
    return this;
  }

  public CT_XYAdjustHandleBuilder setMaxY(ST_AdjCoordinateModel maxY) {
    this.maxY = maxY;
    return this;
  }

  public CT_XYAdjustHandleBuilder setMinY(ST_AdjCoordinateModel minY) {
    this.minY = minY;
    return this;
  }

  public CT_XYAdjustHandleBuilder setMinX(ST_AdjCoordinateModel minX) {
    this.minX = minX;
    return this;
  }

  public CT_XYAdjustHandleBuilder setPos(CT_AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public CT_XYAdjustHandleModel build() {
    return new CT_XYAdjustHandleModel(this.maxX, this.gdRefY, this.gdRefX, this.maxY, this.minY, this.minX, this.pos);
  }

  public CT_XYAdjustHandleBuilder from(CT_XYAdjustHandleModel value) {
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
