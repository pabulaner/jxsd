package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjAngleValueModel;
import jxsd.gen.model.drawingml.main.AdjCoordinateValueModel;
import jxsd.gen.model.drawingml.main.Path2DArcToModel;

/**
 * This is a generated sequence class.
 */
public class Path2DArcToBuilder {
  private AdjAngleValueModel stAng;

  private AdjAngleValueModel swAng;

  private AdjCoordinateValueModel wR;

  private AdjCoordinateValueModel hR;

  public Path2DArcToBuilder() {
  }

  public Path2DArcToBuilder setStAng(AdjAngleValueModel stAng) {
    this.stAng = stAng;
    return this;
  }

  public Path2DArcToBuilder setSwAng(AdjAngleValueModel swAng) {
    this.swAng = swAng;
    return this;
  }

  public Path2DArcToBuilder setWR(AdjCoordinateValueModel wR) {
    this.wR = wR;
    return this;
  }

  public Path2DArcToBuilder setHR(AdjCoordinateValueModel hR) {
    this.hR = hR;
    return this;
  }

  public Path2DArcToBuilder from(Path2DArcToModel value) {
    this.stAng = value.getStAng();
    this.swAng = value.getSwAng();
    this.wR = value.getWR();
    this.hR = value.getHR();
    return this;
  }

  public Path2DArcToModel build() {
    return new Path2DArcToModel(this.stAng, this.swAng, this.wR, this.hR);
  }
}
