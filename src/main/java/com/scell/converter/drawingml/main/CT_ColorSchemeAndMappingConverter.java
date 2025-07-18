package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorSchemeAndMappingModel;
import org.docx4j.dml.CTColorSchemeAndMapping;

public class CT_ColorSchemeAndMappingConverter {
  private CT_ColorSchemeAndMappingConverter() {
  }

  public static CT_ColorSchemeAndMappingModel fromDocx4J(CTColorSchemeAndMapping value) {
    if (value == null) return null;
    return new CT_ColorSchemeAndMappingModel(CT_ColorSchemeConverter.fromDocx4J(value.getClrScheme()), CT_ColorMappingConverter.fromDocx4J(value.getClrMap()));
  }

  public static CTColorSchemeAndMapping toDocx4J(CT_ColorSchemeAndMappingModel value) {
    return null;
  }
}
