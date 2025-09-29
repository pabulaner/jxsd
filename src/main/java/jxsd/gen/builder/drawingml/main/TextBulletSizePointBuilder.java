package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextBulletSizePointModel;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizePointBuilder {
  private int val;

  public TextBulletSizePointBuilder() {
  }

  public TextBulletSizePointBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public TextBulletSizePointBuilder from(TextBulletSizePointModel value) {
    this.val = value.getVal();
    return this;
  }

  public TextBulletSizePointModel build() {
    return new TextBulletSizePointModel(this.val);
  }
}
