package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineJoinMiterPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class LineJoinMiterPropertiesModel {
  private final int lim;

  public LineJoinMiterPropertiesModel(int lim) {
    this.lim = lim;
  }

  public LineJoinMiterPropertiesBuilder builder() {
    return new LineJoinMiterPropertiesBuilder().from(this);
  }

  public int getLim() {
    return this.lim;
  }
}
