package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjAngleValueModel;
import jxsd.gen.model.drawingml.main.AdjCoordinateValueModel;
import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.PolarAdjustHandleModel;

/**
 * This is a generated sequence class.
 */
public class PolarAdjustHandleBuilder {
  private String gdRefAng;

  private String gdRefR;

  private AdjAngleValueModel maxAng;

  private AdjAngleValueModel minAng;

  private AdjCoordinateValueModel maxR;

  private AdjCoordinateValueModel minR;

  private AdjPoint2DModel pos;

  public PolarAdjustHandleBuilder() {
  }

  public PolarAdjustHandleBuilder setGdRefAng(String gdRefAng) {
    this.gdRefAng = gdRefAng;
    return this;
  }

  public PolarAdjustHandleBuilder setGdRefR(String gdRefR) {
    this.gdRefR = gdRefR;
    return this;
  }

  public PolarAdjustHandleBuilder setMaxAng(AdjAngleValueModel maxAng) {
    this.maxAng = maxAng;
    return this;
  }

  public PolarAdjustHandleBuilder setMinAng(AdjAngleValueModel minAng) {
    this.minAng = minAng;
    return this;
  }

  public PolarAdjustHandleBuilder setMaxR(AdjCoordinateValueModel maxR) {
    this.maxR = maxR;
    return this;
  }

  public PolarAdjustHandleBuilder setMinR(AdjCoordinateValueModel minR) {
    this.minR = minR;
    return this;
  }

  public PolarAdjustHandleBuilder setPos(AdjPoint2DModel pos) {
    this.pos = pos;
    return this;
  }

  public PolarAdjustHandleBuilder from(PolarAdjustHandleModel value) {
    this.gdRefAng = value.getGdRefAng();
    this.gdRefR = value.getGdRefR();
    this.maxAng = value.getMaxAng();
    this.minAng = value.getMinAng();
    this.maxR = value.getMaxR();
    this.minR = value.getMinR();
    this.pos = value.getPos();
    return this;
  }

  public PolarAdjustHandleModel build() {
    return new PolarAdjustHandleModel(this.gdRefAng, this.gdRefR, this.maxAng, this.minAng, this.maxR, this.minR, this.pos);
  }
}
