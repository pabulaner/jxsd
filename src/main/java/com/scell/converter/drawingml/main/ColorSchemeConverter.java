package com.scell.converter.drawingml.main;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.model.drawingml.main.ColorSchemeModel;
import org.docx4j.dml.CTColorScheme;

public class ColorSchemeConverter {
  private ColorSchemeConverter() {
  }

  public static ColorSchemeModel fromDocx4J(CTColorScheme value) {
    if (value == null) return null;
    return new ColorSchemeModel(StringConverter.fromDocx4J(value.getName()), ColorConverter.fromDocx4J(value.getDk1()), ColorConverter.fromDocx4J(value.getLt1()), ColorConverter.fromDocx4J(value.getDk2()), ColorConverter.fromDocx4J(value.getLt2()), ColorConverter.fromDocx4J(value.getAccent1()), ColorConverter.fromDocx4J(value.getAccent2()), ColorConverter.fromDocx4J(value.getAccent3()), ColorConverter.fromDocx4J(value.getAccent4()), ColorConverter.fromDocx4J(value.getAccent5()), ColorConverter.fromDocx4J(value.getAccent6()), ColorConverter.fromDocx4J(value.getHlink()), ColorConverter.fromDocx4J(value.getFolHlink()), OfficeArtExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
