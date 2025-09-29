package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.ColorSchemeIndexValueBuilder;
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
    if (value == ColorSchemeIndexValueBuilder.DK_1) return ColorSchemeIndexValueModel.DK_1;
    if (value == ColorSchemeIndexValueBuilder.LT_1) return ColorSchemeIndexValueModel.LT_1;
    if (value == ColorSchemeIndexValueBuilder.DK_2) return ColorSchemeIndexValueModel.DK_2;
    if (value == ColorSchemeIndexValueBuilder.LT_2) return ColorSchemeIndexValueModel.LT_2;
    if (value == ColorSchemeIndexValueBuilder.ACCENT_1) return ColorSchemeIndexValueModel.ACCENT_1;
    if (value == ColorSchemeIndexValueBuilder.ACCENT_2) return ColorSchemeIndexValueModel.ACCENT_2;
    if (value == ColorSchemeIndexValueBuilder.ACCENT_3) return ColorSchemeIndexValueModel.ACCENT_3;
    if (value == ColorSchemeIndexValueBuilder.ACCENT_4) return ColorSchemeIndexValueModel.ACCENT_4;
    if (value == ColorSchemeIndexValueBuilder.ACCENT_5) return ColorSchemeIndexValueModel.ACCENT_5;
    if (value == ColorSchemeIndexValueBuilder.ACCENT_6) return ColorSchemeIndexValueModel.ACCENT_6;
    if (value == ColorSchemeIndexValueBuilder.HLINK) return ColorSchemeIndexValueModel.HLINK;
    if (value == ColorSchemeIndexValueBuilder.FOL_HLINK) return ColorSchemeIndexValueModel.FOL_HLINK;
    return null;
  }

  public static STColorSchemeIndex toDocx4j(ColorSchemeIndexValueModel value) {
    if (value == null) return null;
    if (value == ColorSchemeIndexValueModel.DK_1) return ColorSchemeIndexValueBuilder.DK_1;
    if (value == ColorSchemeIndexValueModel.LT_1) return ColorSchemeIndexValueBuilder.LT_1;
    if (value == ColorSchemeIndexValueModel.DK_2) return ColorSchemeIndexValueBuilder.DK_2;
    if (value == ColorSchemeIndexValueModel.LT_2) return ColorSchemeIndexValueBuilder.LT_2;
    if (value == ColorSchemeIndexValueModel.ACCENT_1) return ColorSchemeIndexValueBuilder.ACCENT_1;
    if (value == ColorSchemeIndexValueModel.ACCENT_2) return ColorSchemeIndexValueBuilder.ACCENT_2;
    if (value == ColorSchemeIndexValueModel.ACCENT_3) return ColorSchemeIndexValueBuilder.ACCENT_3;
    if (value == ColorSchemeIndexValueModel.ACCENT_4) return ColorSchemeIndexValueBuilder.ACCENT_4;
    if (value == ColorSchemeIndexValueModel.ACCENT_5) return ColorSchemeIndexValueBuilder.ACCENT_5;
    if (value == ColorSchemeIndexValueModel.ACCENT_6) return ColorSchemeIndexValueBuilder.ACCENT_6;
    if (value == ColorSchemeIndexValueModel.HLINK) return ColorSchemeIndexValueBuilder.HLINK;
    if (value == ColorSchemeIndexValueModel.FOL_HLINK) return ColorSchemeIndexValueBuilder.FOL_HLINK;
    return null;
  }
}
