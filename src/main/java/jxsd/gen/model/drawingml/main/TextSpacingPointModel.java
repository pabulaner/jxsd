package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextSpacingPointBuilder;

/**
 * This is a generated sequence class.
 */
public class TextSpacingPointModel {
  private final int val;

  public TextSpacingPointModel(int val) {
    this.val = val;
  }

  public TextSpacingPointBuilder builder() {
    return new TextSpacingPointBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
