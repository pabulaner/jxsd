package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorMappingModel;
import jxsd.gen.model.drawingml.main.ColorSchemeAndMappingModel;
import jxsd.gen.model.drawingml.main.ColorSchemeModel;

/**
 * This is a generated sequence class.
 */
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

  public ColorSchemeAndMappingBuilder from(ColorSchemeAndMappingModel value) {
    this.clrScheme = value.getClrScheme();
    this.clrMap = value.getClrMap();
    return this;
  }

  public ColorSchemeAndMappingModel build() {
    return new ColorSchemeAndMappingModel(this.clrScheme, this.clrMap);
  }
}
