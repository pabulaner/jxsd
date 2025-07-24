package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorMappingModel;
import org.docx4j.dml.CTColorMapping;

public class ColorMappingConverter {
  private ColorMappingConverter() {
  }

  public static ColorMappingModel fromDocx4J(CTColorMapping value) {
    if (value == null) return null;
    return new ColorMappingModel(ColorSchemeIndexConverter.fromDocx4J(value.getTx1()), ColorSchemeIndexConverter.fromDocx4J(value.getAccent3()), ColorSchemeIndexConverter.fromDocx4J(value.getAccent2()), ColorSchemeIndexConverter.fromDocx4J(value.getHlink()), ColorSchemeIndexConverter.fromDocx4J(value.getAccent1()), ColorSchemeIndexConverter.fromDocx4J(value.getFolHlink()), ColorSchemeIndexConverter.fromDocx4J(value.getAccent6()), ColorSchemeIndexConverter.fromDocx4J(value.getBg2()), ColorSchemeIndexConverter.fromDocx4J(value.getAccent5()), ColorSchemeIndexConverter.fromDocx4J(value.getBg1()), ColorSchemeIndexConverter.fromDocx4J(value.getTx2()), ColorSchemeIndexConverter.fromDocx4J(value.getAccent4()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
