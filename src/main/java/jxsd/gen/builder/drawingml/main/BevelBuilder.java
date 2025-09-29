package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.BevelModel;
import jxsd.gen.model.drawingml.main.BevelPresetTypeValueModel;

/**
 * This is a generated sequence class.
 */
public class BevelBuilder {
  private long h;

  private long w;

  private BevelPresetTypeValueModel prst;

  public BevelBuilder() {
  }

  public BevelBuilder setH(long h) {
    this.h = h;
    return this;
  }

  public BevelBuilder setW(long w) {
    this.w = w;
    return this;
  }

  public BevelBuilder setPrst(BevelPresetTypeValueModel prst) {
    this.prst = prst;
    return this;
  }

  public BevelBuilder from(BevelModel value) {
    this.h = value.getH();
    this.w = value.getW();
    this.prst = value.getPrst();
    return this;
  }

  public BevelModel build() {
    return new BevelModel(this.h, this.w, this.prst);
  }
}
