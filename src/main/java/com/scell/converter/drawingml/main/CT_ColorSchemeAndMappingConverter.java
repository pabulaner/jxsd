package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorSchemeAndMappingModel;
import org.docx4j.dml.CTColorSchemeAndMapping;

public class CT_ColorSchemeAndMappingConverter {
  private CT_ColorSchemeAndMappingConverter() {
  }

  public static CT_ColorSchemeAndMappingModel fromDocx4j(CTColorSchemeAndMapping value) {
    if (value == null) return null;
    return new CT_ColorSchemeAndMappingModel(CT_ColorSchemeConverter.fromDocx4j(value.getClrScheme()), CT_ColorMappingConverter.fromDocx4j(value.getClrMap()));
  }

  public static CTColorSchemeAndMapping toDocx4j(CT_ColorSchemeAndMappingModel value) {
    return null;
  }
}
