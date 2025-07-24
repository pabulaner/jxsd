package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeAndMappingModel;
import org.docx4j.dml.CTColorSchemeAndMapping;

public class ColorSchemeAndMappingConverter {
  private ColorSchemeAndMappingConverter() {
  }

  public static ColorSchemeAndMappingModel fromDocx4J(CTColorSchemeAndMapping value) {
    if (value == null) return null;
    return new ColorSchemeAndMappingModel(ColorSchemeConverter.fromDocx4J(value.getClrScheme()), ColorMappingConverter.fromDocx4J(value.getClrMap()));
  }
}
