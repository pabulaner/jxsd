package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.FlatTextModel;

/**
 * This is a generated sequence class.
 */
public class FlatTextBuilder {
  private long z;

  public FlatTextBuilder() {
  }

  public FlatTextBuilder setZ(long z) {
    this.z = z;
    return this;
  }

  public FlatTextBuilder from(FlatTextModel value) {
    this.z = value.getZ();
    return this;
  }

  public FlatTextModel build() {
    return new FlatTextModel(this.z);
  }
}
