package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPercentValueModel;

public class TextSpacingPercentValueBuilder {
  private int value;

  public TextSpacingPercentValueBuilder() {
  }

  public TextSpacingPercentValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextSpacingPercentValueBuilder from(TextSpacingPercentValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextSpacingPercentValueModel build() {
    return new TextSpacingPercentValueModel(this.value);
  }
}
