package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPointModel;
import com.scell.model.drawingml.main.TextSpacingPointValueModel;

public class TextSpacingPointBuilder {
  private TextSpacingPointValueModel val;

  public TextSpacingPointBuilder() {
  }

  public TextSpacingPointBuilder setVal(TextSpacingPointValueModel val) {
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
