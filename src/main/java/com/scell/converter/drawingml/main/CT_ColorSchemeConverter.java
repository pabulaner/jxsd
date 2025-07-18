package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.CT_ColorSchemeModel;
import org.docx4j.dml.CTColorScheme;

public class CT_ColorSchemeConverter {
  private CT_ColorSchemeConverter() {
  }

  public static CT_ColorSchemeModel fromDocx4J(CTColorScheme value) {
    if (value == null) return null;
    return new CT_ColorSchemeModel(StringConverter.fromDocx4J(value.getName()), CT_ColorConverter.fromDocx4J(value.getDk1()), CT_ColorConverter.fromDocx4J(value.getLt1()), CT_ColorConverter.fromDocx4J(value.getDk2()), CT_ColorConverter.fromDocx4J(value.getLt2()), CT_ColorConverter.fromDocx4J(value.getAccent1()), CT_ColorConverter.fromDocx4J(value.getAccent2()), CT_ColorConverter.fromDocx4J(value.getAccent3()), CT_ColorConverter.fromDocx4J(value.getAccent4()), CT_ColorConverter.fromDocx4J(value.getAccent5()), CT_ColorConverter.fromDocx4J(value.getAccent6()), CT_ColorConverter.fromDocx4J(value.getHlink()), CT_ColorConverter.fromDocx4J(value.getFolHlink()), CT_OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTColorScheme toDocx4J(CT_ColorSchemeModel value) {
    return null;
  }
}
