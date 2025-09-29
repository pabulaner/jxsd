package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletSizePercentModel;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizePercentBuilder {
  private int val;

  public TextBulletSizePercentBuilder() {
  }

  public TextBulletSizePercentBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public TextBulletSizePercentBuilder from(TextBulletSizePercentModel value) {
    this.val = value.getVal();
    return this;
  }

  public TextBulletSizePercentModel build() {
    return new TextBulletSizePercentModel(this.val);
  }
}
