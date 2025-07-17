package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_ColorSchemeIndexModel;
import org.docx4j.dml.STColorSchemeIndex;

public class ST_ColorSchemeIndexConverter {
  private ST_ColorSchemeIndexConverter() {
  }

  public static ST_ColorSchemeIndexModel fromDocx4j(STColorSchemeIndex value) {
    if (value == null) return null;
    if (value == STColorSchemeIndex.DK1) return ST_ColorSchemeIndexModel.DK1;
    if (value == STColorSchemeIndex.LT1) return ST_ColorSchemeIndexModel.LT1;
    if (value == STColorSchemeIndex.DK2) return ST_ColorSchemeIndexModel.DK2;
    if (value == STColorSchemeIndex.LT2) return ST_ColorSchemeIndexModel.LT2;
    if (value == STColorSchemeIndex.ACCENT1) return ST_ColorSchemeIndexModel.ACCENT1;
    if (value == STColorSchemeIndex.ACCENT2) return ST_ColorSchemeIndexModel.ACCENT2;
    if (value == STColorSchemeIndex.ACCENT3) return ST_ColorSchemeIndexModel.ACCENT3;
    if (value == STColorSchemeIndex.ACCENT4) return ST_ColorSchemeIndexModel.ACCENT4;
    if (value == STColorSchemeIndex.ACCENT5) return ST_ColorSchemeIndexModel.ACCENT5;
    if (value == STColorSchemeIndex.ACCENT6) return ST_ColorSchemeIndexModel.ACCENT6;
    if (value == STColorSchemeIndex.HLINK) return ST_ColorSchemeIndexModel.HLINK;
    if (value == STColorSchemeIndex.FOL_HLINK) return ST_ColorSchemeIndexModel.FOL_HLINK;
    return null;
  }

  public static STColorSchemeIndex toDocx4j(ST_ColorSchemeIndexModel value) {
    return null;
  }
}
