package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.FlatTextBuilder;

/**
 * This is a generated sequence class.
 */
public class FlatTextModel {
  private final long z;

  public FlatTextModel(long z) {
    this.z = z;
  }

  public FlatTextBuilder builder() {
    return new FlatTextBuilder().from(this);
  }

  public long getZ() {
    return this.z;
  }
}
