package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.LineJoinMiterPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class LineJoinMiterPropertiesBuilder {
  private int lim;

  public LineJoinMiterPropertiesBuilder() {
  }

  public LineJoinMiterPropertiesBuilder setLim(int lim) {
    this.lim = lim;
    return this;
  }

  public LineJoinMiterPropertiesBuilder from(LineJoinMiterPropertiesModel value) {
    this.lim = value.getLim();
    return this;
  }

  public LineJoinMiterPropertiesModel build() {
    return new LineJoinMiterPropertiesModel(this.lim);
  }
}
