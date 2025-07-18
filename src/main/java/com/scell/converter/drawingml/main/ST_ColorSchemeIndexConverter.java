package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_ColorSchemeIndexModel;
import org.docx4j.dml.STColorSchemeIndex;

public class ST_ColorSchemeIndexConverter {
  private ST_ColorSchemeIndexConverter() {
  }

  public static ST_ColorSchemeIndexModel fromDocx4J(STColorSchemeIndex value) {
    if (value == null) return null;
    if (value == STColorSchemeIndex.DK_1) return ST_ColorSchemeIndexModel.DK_1;
    if (value == STColorSchemeIndex.LT_1) return ST_ColorSchemeIndexModel.LT_1;
    if (value == STColorSchemeIndex.DK_2) return ST_ColorSchemeIndexModel.DK_2;
    if (value == STColorSchemeIndex.LT_2) return ST_ColorSchemeIndexModel.LT_2;
    if (value == STColorSchemeIndex.ACCENT_1) return ST_ColorSchemeIndexModel.ACCENT_1;
    if (value == STColorSchemeIndex.ACCENT_2) return ST_ColorSchemeIndexModel.ACCENT_2;
    if (value == STColorSchemeIndex.ACCENT_3) return ST_ColorSchemeIndexModel.ACCENT_3;
    if (value == STColorSchemeIndex.ACCENT_4) return ST_ColorSchemeIndexModel.ACCENT_4;
    if (value == STColorSchemeIndex.ACCENT_5) return ST_ColorSchemeIndexModel.ACCENT_5;
    if (value == STColorSchemeIndex.ACCENT_6) return ST_ColorSchemeIndexModel.ACCENT_6;
    if (value == STColorSchemeIndex.HLINK) return ST_ColorSchemeIndexModel.HLINK;
    if (value == STColorSchemeIndex.FOL_HLINK) return ST_ColorSchemeIndexModel.FOL_HLINK;
    return null;
  }

  public static STColorSchemeIndex toDocx4J(ST_ColorSchemeIndexModel value) {
    return null;
  }
}
