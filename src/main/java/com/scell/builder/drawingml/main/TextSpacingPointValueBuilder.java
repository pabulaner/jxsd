package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPointValueModel;

public class TextSpacingPointValueBuilder {
  private int value;

  public TextSpacingPointValueBuilder() {
  }

  public TextSpacingPointValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextSpacingPointValueBuilder from(TextSpacingPointValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextSpacingPointValueModel build() {
    return new TextSpacingPointValueModel(this.value);
  }
}
