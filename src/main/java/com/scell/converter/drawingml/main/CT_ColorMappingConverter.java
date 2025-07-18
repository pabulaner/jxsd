package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMappingModel;
import org.docx4j.dml.CTColorMapping;

public class CT_ColorMappingConverter {
  private CT_ColorMappingConverter() {
  }

  public static CT_ColorMappingModel fromDocx4J(CTColorMapping value) {
    if (value == null) return null;
    return new CT_ColorMappingModel(ST_ColorSchemeIndexConverter.fromDocx4J(value.getTx1()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getAccent3()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getAccent2()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getHlink()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getAccent1()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getFolHlink()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getAccent6()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getBg2()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getAccent5()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getBg1()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getTx2()), ST_ColorSchemeIndexConverter.fromDocx4J(value.getAccent4()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTColorMapping toDocx4J(CT_ColorMappingModel value) {
    return null;
  }
}
