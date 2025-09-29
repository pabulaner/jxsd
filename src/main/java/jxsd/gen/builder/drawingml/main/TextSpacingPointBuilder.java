package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.TextSpacingPointModel;

/**
 * This is a generated sequence class.
 */
public class TextSpacingPointBuilder {
  private int val;

  public TextSpacingPointBuilder() {
  }

  public TextSpacingPointBuilder setVal(int val) {
    this.val = val;
    return this;
  }

  public TextSpacingPointBuilder from(TextSpacingPointModel value) {
    this.val = value.getVal();
    return this;
  }

  public TextSpacingPointModel build() {
    return new TextSpacingPointModel(this.val);
  }
}
