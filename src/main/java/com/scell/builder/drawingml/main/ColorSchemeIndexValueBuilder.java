package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeIndexValueModel;

public class ColorSchemeIndexValueBuilder {
  private ColorSchemeIndexValueModel value;

  public ColorSchemeIndexValueBuilder() {
    this.value = null;
  }

  public ColorSchemeIndexValueBuilder from(ColorSchemeIndexValueModel value) {
    this.value = value;
    return this;
  }

  public ColorSchemeIndexValueModel build() {
    return this.value;
  }

  public ColorSchemeIndexValueBuilder setValue(ColorSchemeIndexValueModel value) {
    this.value = value;
    return this;
  }
}
