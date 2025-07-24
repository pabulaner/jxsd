package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPercentModel;

public class TextSpacingPercentBuilder {
  private TextSpacingPercentModel val;

  public TextSpacingPercentBuilder() {
  }

  public TextSpacingPercentBuilder setVal(TextSpacingPercentModel val) {
    this.val = val;
    return this;
  }

  public TextSpacingPercentModel build() {
    return new TextSpacingPercentModel(this.val);
  }

  public TextSpacingPercentBuilder from(TextSpacingPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
