package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.PolarAdjustHandleBuilder;

/**
 * This is a generated sequence class.
 */
public class PolarAdjustHandleModel {
  private final String gdRefAng;

  private final String gdRefR;

  private final AdjAngleValueModel maxAng;

  private final AdjAngleValueModel minAng;

  private final AdjCoordinateValueModel maxR;

  private final AdjCoordinateValueModel minR;

  private final AdjPoint2DModel pos;

  public PolarAdjustHandleModel(String gdRefAng, String gdRefR, AdjAngleValueModel maxAng,
      AdjAngleValueModel minAng, AdjCoordinateValueModel maxR, AdjCoordinateValueModel minR,
      AdjPoint2DModel pos) {
    this.gdRefAng = gdRefAng;
    this.gdRefR = gdRefR;
    this.maxAng = maxAng;
    this.minAng = minAng;
    this.maxR = maxR;
    this.minR = minR;
    this.pos = pos;
  }

  public PolarAdjustHandleBuilder builder() {
    return new PolarAdjustHandleBuilder().from(this);
  }

  public String getGdRefAng() {
    return this.gdRefAng;
  }

  public String getGdRefR() {
    return this.gdRefR;
  }

  public AdjAngleValueModel getMaxAng() {
    return this.maxAng;
  }

  public AdjAngleValueModel getMinAng() {
    return this.minAng;
  }

  public AdjCoordinateValueModel getMaxR() {
    return this.maxR;
  }

  public AdjCoordinateValueModel getMinR() {
    return this.minR;
  }

  public AdjPoint2DModel getPos() {
    return this.pos;
  }
}
