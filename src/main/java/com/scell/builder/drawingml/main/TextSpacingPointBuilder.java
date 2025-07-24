package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPointModel;

public class TextSpacingPointBuilder {
  private TextSpacingPointModel val;

  public TextSpacingPointBuilder() {
  }

  public TextSpacingPointBuilder setVal(TextSpacingPointModel val) {
    this.val = val;
    return this;
  }

  public TextSpacingPointModel build() {
    return new TextSpacingPointModel(this.val);
  }

  public TextSpacingPointBuilder from(TextSpacingPointModel value) {
    this.val = value.getVal();
    return this;
  }
}
