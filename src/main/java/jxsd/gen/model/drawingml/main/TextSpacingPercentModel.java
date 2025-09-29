package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextSpacingPercentBuilder;

/**
 * This is a generated sequence class.
 */
public class TextSpacingPercentModel {
  private final int val;

  public TextSpacingPercentModel(int val) {
    this.val = val;
  }

  public TextSpacingPercentBuilder builder() {
    return new TextSpacingPercentBuilder().from(this);
  }

  public int getVal() {
    return this.val;
  }
}
