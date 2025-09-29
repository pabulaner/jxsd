package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Path2DArcToBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DArcToModel {
  private final AdjAngleValueModel stAng;

  private final AdjAngleValueModel swAng;

  private final AdjCoordinateValueModel wR;

  private final AdjCoordinateValueModel hR;

  public Path2DArcToModel(AdjAngleValueModel stAng, AdjAngleValueModel swAng,
      AdjCoordinateValueModel wR, AdjCoordinateValueModel hR) {
    this.stAng = stAng;
    this.swAng = swAng;
    this.wR = wR;
    this.hR = hR;
  }

  public Path2DArcToBuilder builder() {
    return new Path2DArcToBuilder().from(this);
  }

  public AdjAngleValueModel getStAng() {
    return this.stAng;
  }

  public AdjAngleValueModel getSwAng() {
    return this.swAng;
  }

  public AdjCoordinateValueModel getWR() {
    return this.wR;
  }

  public AdjCoordinateValueModel getHR() {
    return this.hR;
  }
}
