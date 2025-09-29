package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorSchemeAndMappingModel;
import org.docx4j.dml.CTColorSchemeAndMapping;

/**
 * This is a generated sequence class.
 */
public class ColorSchemeAndMappingConverter {
  private ColorSchemeAndMappingConverter() {
  }

  public static ColorSchemeAndMappingModel fromDocx4j(CTColorSchemeAndMapping value) {
    if (value == null) return null;
    return new ColorSchemeAndMappingModel(ColorSchemeConverter.fromDocx4j(value.getClrScheme()), ColorMappingConverter.fromDocx4j(value.getClrMap()));
  }

  public static CTColorSchemeAndMapping toDocx4j(ColorSchemeAndMappingModel value) {
    if (value == null) return null;
    CTColorSchemeAndMapping result = new CTColorSchemeAndMapping();
    result.setClrScheme(ColorSchemeConverter.toDocx4j(value.getClrScheme()));
    result.setClrMap(ColorMappingConverter.toDocx4j(value.getClrMap()));
    return result;
  }
}
