package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjCoordinateValueModel;
import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.XYAdjustHandleModel;

/**
 * This is a generated sequence class.
 */
public class XYAdjustHandleBuilder {
  private AdjCoordinateValueModel maxX;

  private String gdRefY;

  private String gdRefX;

  private AdjCoordinateValueModel maxY;

  private AdjCoordinateValueModel minY;

  private AdjCoordinateValueModel minX;

  private AdjPoint2DModel pos;

  public XYAdjustHandleBuilder() {
  }

  public XYAdjustHandleBuilder setMaxX(AdjCoordinateValueModel maxX) {
    this.maxX = maxX;
    return this;
  }

  public XYAdjustHandleBuilder setGdRefY(String gdRefY) {
    this.gdRefY = gdRefY;
    return this;
  }

  public XYAdjustHandleBuilder setGdRefX(String gdRefX) {
    this.gdRefX = gdRefX;
    return this;
  }

  public XYAdjustHandleBuilder setMaxY(AdjCoordinateValueModel maxY) {
    this.maxY = maxY;
    return this;
  }

  public XYAdjustHandleBuilder setMinY(AdjCoordinateValueModel minY) {
    this.minY = minY;
    return this;
  }

  public XYAdjustHandleBuilder setMinX(AdjCoordinateValueModel minX) {
    this.minX = minX;
    return this;
  }

  public XYAdjustHandleBuilder setPos(AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
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

  public XYAdjustHandleModel build() {
    return new XYAdjustHandleModel(this.maxX, this.gdRefY, this.gdRefX, this.maxY, this.minY, this.minX, this.pos);
  }
}
