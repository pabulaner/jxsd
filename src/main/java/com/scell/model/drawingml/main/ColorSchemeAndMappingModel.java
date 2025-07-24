package com.scell.model.drawingml.main;

public class ColorSchemeAndMappingModel {
  private final ColorSchemeModel clrScheme;

  private final ColorMappingModel clrMap;

  public ColorSchemeAndMappingModel(ColorSchemeModel clrScheme, ColorMappingModel clrMap) {
    this.clrScheme = clrScheme;
    this.clrMap = clrMap;
  }

  public ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public ColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
