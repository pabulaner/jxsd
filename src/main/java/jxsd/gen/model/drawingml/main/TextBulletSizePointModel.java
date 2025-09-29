package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextBulletSizePointBuilder;

/**
 * This is a generated sequence class.
 */
public class TextBulletSizePointModel {
  private final int val;

  public TextBulletSizePointModel(int val) {
    this.val = val;
  }

  public TextBulletSizePointBuilder builder() {
    return new TextBulletSizePointBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
