package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ColorSchemeIndexValueModel;
import org.docx4j.dml.STColorSchemeIndex;

public class ColorSchemeIndexValueConverter {
  private ColorSchemeIndexValueConverter() {
  }

  public static ColorSchemeIndexValueModel fromDocx4J(STColorSchemeIndex value) {
    if (value == null) return null;
    if (value == STColorSchemeIndex.DK_1) return ColorSchemeIndexValueModel.DK_1;
    if (value == STColorSchemeIndex.LT_1) return ColorSchemeIndexValueModel.LT_1;
    if (value == STColorSchemeIndex.DK_2) return ColorSchemeIndexValueModel.DK_2;
    if (value == STColorSchemeIndex.LT_2) return ColorSchemeIndexValueModel.LT_2;
    if (value == STColorSchemeIndex.ACCENT_1) return ColorSchemeIndexValueModel.ACCENT_1;
    if (value == STColorSchemeIndex.ACCENT_2) return ColorSchemeIndexValueModel.ACCENT_2;
    if (value == STColorSchemeIndex.ACCENT_3) return ColorSchemeIndexValueModel.ACCENT_3;
    if (value == STColorSchemeIndex.ACCENT_4) return ColorSchemeIndexValueModel.ACCENT_4;
    if (value == STColorSchemeIndex.ACCENT_5) return ColorSchemeIndexValueModel.ACCENT_5;
    if (value == STColorSchemeIndex.ACCENT_6) return ColorSchemeIndexValueModel.ACCENT_6;
    if (value == STColorSchemeIndex.HLINK) return ColorSchemeIndexValueModel.HLINK;
    if (value == STColorSchemeIndex.FOL_HLINK) return ColorSchemeIndexValueModel.FOL_HLINK;
    return null;
  }
}
