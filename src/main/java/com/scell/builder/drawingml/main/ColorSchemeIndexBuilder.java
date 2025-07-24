package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeIndexModel;

public class ColorSchemeIndexBuilder {
  private ColorSchemeIndexModel value;

  public ColorSchemeIndexBuilder() {
    this.value = null;
  }

  public ColorSchemeIndexBuilder from(ColorSchemeIndexModel value) {
    this.value = value;
    return this;
  }

  public ColorSchemeIndexModel build() {
    return this.value;
  }

  public ColorSchemeIndexBuilder setValue(ColorSchemeIndexModel value) {
    this.value = value;
    return this;
  }
}
