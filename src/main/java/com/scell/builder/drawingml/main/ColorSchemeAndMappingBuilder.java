package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ColorMappingModel;
import com.scell.model.drawingml.main.ColorSchemeAndMappingModel;
import com.scell.model.drawingml.main.ColorSchemeModel;

public class ColorSchemeAndMappingBuilder {
  private ColorSchemeModel clrScheme;

  private ColorMappingModel clrMap;

  public ColorSchemeAndMappingBuilder() {
  }

  public ColorSchemeAndMappingBuilder setClrScheme(ColorSchemeModel clrScheme) {
    this.clrScheme = clrScheme;
    return this;
  }

  public ColorSchemeAndMappingBuilder setClrMap(ColorMappingModel clrMap) {
    this.clrMap = clrMap;
    return this;
  }

  public ColorSchemeAndMappingModel build() {
    return new ColorSchemeAndMappingModel(this.clrScheme, this.clrMap);
  }

  public ColorSchemeAndMappingBuilder from(ColorSchemeAndMappingModel value) {
    this.clrScheme = value.getClrScheme();
    this.clrMap = value.getClrMap();
    return this;
  }
}
