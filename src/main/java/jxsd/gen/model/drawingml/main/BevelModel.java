package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.BevelBuilder;

/**
 * This is a generated sequence class.
 */
public class BevelModel {
  private final long h;

  private final long w;

  private final BevelPresetTypeValueModel prst;

  public BevelModel(long h, long w, BevelPresetTypeValueModel prst) {
    this.h = h;
    this.w = w;
    this.prst = prst;
  }

  public BevelBuilder builder() {
    return new BevelBuilder().from(this);
  }

  public long getH() {
    return this.h;
  }

  public long getW() {
    return this.w;
  }

  public BevelPresetTypeValueModel getPrst() {
    return this.prst;
  }
}
