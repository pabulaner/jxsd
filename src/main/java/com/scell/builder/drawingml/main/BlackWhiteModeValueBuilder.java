package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlackWhiteModeValueModel;

public class BlackWhiteModeValueBuilder {
  private BlackWhiteModeValueModel value;

  public BlackWhiteModeValueBuilder() {
    this.value = null;
  }

  public BlackWhiteModeValueBuilder from(BlackWhiteModeValueModel value) {
    this.value = value;
    return this;
  }

  public BlackWhiteModeValueModel build() {
    return this.value;
  }

  public BlackWhiteModeValueBuilder setValue(BlackWhiteModeValueModel value) {
    this.value = value;
    return this;
  }
}
