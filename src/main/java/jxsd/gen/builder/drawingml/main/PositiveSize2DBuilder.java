package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.PositiveSize2DModel;

/**
 * This is a generated sequence class.
 */
public class PositiveSize2DBuilder {
  private long cy;

  private long cx;

  public PositiveSize2DBuilder() {
  }

  public PositiveSize2DBuilder setCy(long cy) {
    this.cy = cy;
    return this;
  }

  public PositiveSize2DBuilder setCx(long cx) {
    this.cx = cx;
    return this;
  }

  public PositiveSize2DBuilder from(PositiveSize2DModel value) {
    this.cy = value.getCy();
    this.cx = value.getCx();
    return this;
  }

  public PositiveSize2DModel build() {
    return new PositiveSize2DModel(this.cy, this.cx);
  }
}
