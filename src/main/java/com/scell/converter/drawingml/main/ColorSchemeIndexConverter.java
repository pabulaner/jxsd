package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeIndexModel;
import org.docx4j.dml.STColorSchemeIndex;

public class ColorSchemeIndexConverter {
  private ColorSchemeIndexConverter() {
  }

  public static ColorSchemeIndexModel fromDocx4J(STColorSchemeIndex value) {
    if (value == null) return null;
    if (value == STColorSchemeIndex.DK_1) return ColorSchemeIndexModel.DK_1;
    if (value == STColorSchemeIndex.LT_1) return ColorSchemeIndexModel.LT_1;
    if (value == STColorSchemeIndex.DK_2) return ColorSchemeIndexModel.DK_2;
    if (value == STColorSchemeIndex.LT_2) return ColorSchemeIndexModel.LT_2;
    if (value == STColorSchemeIndex.ACCENT_1) return ColorSchemeIndexModel.ACCENT_1;
    if (value == STColorSchemeIndex.ACCENT_2) return ColorSchemeIndexModel.ACCENT_2;
    if (value == STColorSchemeIndex.ACCENT_3) return ColorSchemeIndexModel.ACCENT_3;
    if (value == STColorSchemeIndex.ACCENT_4) return ColorSchemeIndexModel.ACCENT_4;
    if (value == STColorSchemeIndex.ACCENT_5) return ColorSchemeIndexModel.ACCENT_5;
    if (value == STColorSchemeIndex.ACCENT_6) return ColorSchemeIndexModel.ACCENT_6;
    if (value == STColorSchemeIndex.HLINK) return ColorSchemeIndexModel.HLINK;
    if (value == STColorSchemeIndex.FOL_HLINK) return ColorSchemeIndexModel.FOL_HLINK;
    return null;
  }
}
