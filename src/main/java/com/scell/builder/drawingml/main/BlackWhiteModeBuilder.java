package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.BlackWhiteModeModel;

public class BlackWhiteModeBuilder {
  private BlackWhiteModeModel value;

  public BlackWhiteModeBuilder() {
    this.value = null;
  }

  public BlackWhiteModeBuilder from(BlackWhiteModeModel value) {
    this.value = value;
    return this;
  }

  public BlackWhiteModeModel build() {
    return this.value;
  }

  public BlackWhiteModeBuilder setValue(BlackWhiteModeModel value) {
    this.value = value;
    return this;
  }
}
