package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_ColorSchemeModel;
import org.docx4j.dml.CTColorScheme;

public class CT_ColorSchemeConverter {
  private CT_ColorSchemeConverter() {
  }

  public static CT_ColorSchemeModel fromDocx4j(CTColorScheme value) {
    if (value == null) return null;
    return new CT_ColorSchemeModel(StringConverter.fromDocx4j(value.getName()), CT_ColorConverter.fromDocx4j(value.getDk1()), CT_ColorConverter.fromDocx4j(value.getLt1()), CT_ColorConverter.fromDocx4j(value.getDk2()), CT_ColorConverter.fromDocx4j(value.getLt2()), CT_ColorConverter.fromDocx4j(value.getAccent1()), CT_ColorConverter.fromDocx4j(value.getAccent2()), CT_ColorConverter.fromDocx4j(value.getAccent3()), CT_ColorConverter.fromDocx4j(value.getAccent4()), CT_ColorConverter.fromDocx4j(value.getAccent5()), CT_ColorConverter.fromDocx4j(value.getAccent6()), CT_ColorConverter.fromDocx4j(value.getHlink()), CT_ColorConverter.fromDocx4j(value.getFolHlink()), CT_OfficeArtExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTColorScheme toDocx4j(CT_ColorSchemeModel value) {
    return null;
  }
}
