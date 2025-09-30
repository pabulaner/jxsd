package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ColorSchemeIndexValueModel;
import org.docx4j.dml.STColorSchemeIndex;

/**
 * This is a generated enum class.
 */
public class ColorSchemeIndexValueConverter {
  private ColorSchemeIndexValueConverter() {
  }

  public static ColorSchemeIndexValueModel fromDocx4j(STColorSchemeIndex value) {
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

  public static STColorSchemeIndex toDocx4j(ColorSchemeIndexValueModel value) {
    if (value == null) return null;
    if (value == ColorSchemeIndexValueModel.DK_1) return STColorSchemeIndex.DK_1;
    if (value == ColorSchemeIndexValueModel.LT_1) return STColorSchemeIndex.LT_1;
    if (value == ColorSchemeIndexValueModel.DK_2) return STColorSchemeIndex.DK_2;
    if (value == ColorSchemeIndexValueModel.LT_2) return STColorSchemeIndex.LT_2;
    if (value == ColorSchemeIndexValueModel.ACCENT_1) return STColorSchemeIndex.ACCENT_1;
    if (value == ColorSchemeIndexValueModel.ACCENT_2) return STColorSchemeIndex.ACCENT_2;
    if (value == ColorSchemeIndexValueModel.ACCENT_3) return STColorSchemeIndex.ACCENT_3;
    if (value == ColorSchemeIndexValueModel.ACCENT_4) return STColorSchemeIndex.ACCENT_4;
    if (value == ColorSchemeIndexValueModel.ACCENT_5) return STColorSchemeIndex.ACCENT_5;
    if (value == ColorSchemeIndexValueModel.ACCENT_6) return STColorSchemeIndex.ACCENT_6;
    if (value == ColorSchemeIndexValueModel.HLINK) return STColorSchemeIndex.HLINK;
    if (value == ColorSchemeIndexValueModel.FOL_HLINK) return STColorSchemeIndex.FOL_HLINK;
    return null;
  }
}
