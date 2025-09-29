package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextSpacingPercentModel;

/**
 * This is a generated sequence class.
 */
public class TextSpacingPercentBuilder {
  private int val;

  public TextSpacingPercentBuilder() {
  }

  public TextSpacingPercentBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public TextSpacingPercentBuilder from(TextSpacingPercentModel value) {
    this.val = value.getVal();
    return this;
  }

  public TextSpacingPercentModel build() {
    return new TextSpacingPercentModel(this.val);
  }
}
