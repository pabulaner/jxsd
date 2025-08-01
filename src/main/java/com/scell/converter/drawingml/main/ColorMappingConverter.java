package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorMappingModel;
import org.docx4j.dml.CTColorMapping;

public class ColorMappingConverter {
  private ColorMappingConverter() {
  }

  public static ColorMappingModel fromDocx4J(CTColorMapping value) {
    if (value == null) return null;
    return new ColorMappingModel(ColorSchemeIndexValueConverter.fromDocx4J(value.getTx1()), ColorSchemeIndexValueConverter.fromDocx4J(value.getAccent3()), ColorSchemeIndexValueConverter.fromDocx4J(value.getAccent2()), ColorSchemeIndexValueConverter.fromDocx4J(value.getHlink()), ColorSchemeIndexValueConverter.fromDocx4J(value.getAccent1()), ColorSchemeIndexValueConverter.fromDocx4J(value.getFolHlink()), ColorSchemeIndexValueConverter.fromDocx4J(value.getAccent6()), ColorSchemeIndexValueConverter.fromDocx4J(value.getBg2()), ColorSchemeIndexValueConverter.fromDocx4J(value.getAccent5()), ColorSchemeIndexValueConverter.fromDocx4J(value.getBg1()), ColorSchemeIndexValueConverter.fromDocx4J(value.getTx2()), ColorSchemeIndexValueConverter.fromDocx4J(value.getAccent4()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
