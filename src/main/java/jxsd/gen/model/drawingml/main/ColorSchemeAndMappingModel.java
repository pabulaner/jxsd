package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.ColorSchemeAndMappingBuilder;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeAndMappingModel {
  private final ColorSchemeModel clrScheme;

  private final ColorMappingModel clrMap;

  public ColorSchemeAndMappingModel(ColorSchemeModel clrScheme, ColorMappingModel clrMap) {
    this.clrScheme = clrScheme;
    this.clrMap = clrMap;
  }

  public ColorSchemeAndMappingBuilder builder() {
    return new ColorSchemeAndMappingBuilder().from(this);
  }

  public ColorSchemeModel getClrScheme() {
    return this.clrScheme;
  }

  public ColorMappingModel getClrMap() {
    return this.clrMap;
  }
}
