package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPercentModel;
import com.scell.model.drawingml.main.TextSpacingPercentValueModel;

public class TextSpacingPercentBuilder {
  private TextSpacingPercentValueModel val;

  public TextSpacingPercentBuilder() {
  }

  public TextSpacingPercentBuilder setVal(TextSpacingPercentValueModel val) {
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
