package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorMappingModel;
import org.docx4j.dml.CTColorMapping;

public class CT_ColorMappingConverter {
  private CT_ColorMappingConverter() {
  }

  public static CT_ColorMappingModel fromDocx4j(CTColorMapping value) {
    if (value == null) return null;
    return new CT_ColorMappingModel(ST_ColorSchemeIndexConverter.fromDocx4j(value.getTx1()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getAccent3()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getAccent2()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getHlink()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getAccent1()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getFolHlink()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getAccent6()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getBg2()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getAccent5()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getBg1()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getTx2()), ST_ColorSchemeIndexConverter.fromDocx4j(value.getAccent4()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTColorMapping toDocx4j(CT_ColorMappingModel value) {
    return null;
  }
}
