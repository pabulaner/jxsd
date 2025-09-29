package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextBulletSizePercentBuilder;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizePercentModel {
  private final int val;

  public TextBulletSizePercentModel(int val) {
    this.val = val;
  }

  public TextBulletSizePercentBuilder builder() {
    return new TextBulletSizePercentBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
