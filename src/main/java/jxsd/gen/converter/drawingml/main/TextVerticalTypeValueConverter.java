package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextVerticalTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextVerticalTypeValueModel;
import org.docx4j.dml.STTextVerticalType;

/**
 * This is a generated enum class.
 */
public class TextVerticalTypeValueConverter {
  private TextVerticalTypeValueConverter() {
  }

  public static TextVerticalTypeValueModel fromDocx4j(STTextVerticalType value) {
    if (value == null) return null;
    if (value == TextVerticalTypeValueBuilder.HORZ) return TextVerticalTypeValueModel.HORZ;
    if (value == TextVerticalTypeValueBuilder.VERT) return TextVerticalTypeValueModel.VERT;
    if (value == TextVerticalTypeValueBuilder.VERT_270) return TextVerticalTypeValueModel.VERT_270;
    if (value == TextVerticalTypeValueBuilder.WORD_ART_VERT) return TextVerticalTypeValueModel.WORD_ART_VERT;
    if (value == TextVerticalTypeValueBuilder.EA_VERT) return TextVerticalTypeValueModel.EA_VERT;
    if (value == TextVerticalTypeValueBuilder.MONGOLIAN_VERT) return TextVerticalTypeValueModel.MONGOLIAN_VERT;
    if (value == TextVerticalTypeValueBuilder.WORD_ART_VERT_RTL) return TextVerticalTypeValueModel.WORD_ART_VERT_RTL;
    return null;
  }

  public static STTextVerticalType toDocx4j(TextVerticalTypeValueModel value) {
    if (value == null) return null;
    if (value == TextVerticalTypeValueModel.HORZ) return TextVerticalTypeValueBuilder.HORZ;
    if (value == TextVerticalTypeValueModel.VERT) return TextVerticalTypeValueBuilder.VERT;
    if (value == TextVerticalTypeValueModel.VERT_270) return TextVerticalTypeValueBuilder.VERT_270;
    if (value == TextVerticalTypeValueModel.WORD_ART_VERT) return TextVerticalTypeValueBuilder.WORD_ART_VERT;
    if (value == TextVerticalTypeValueModel.EA_VERT) return TextVerticalTypeValueBuilder.EA_VERT;
    if (value == TextVerticalTypeValueModel.MONGOLIAN_VERT) return TextVerticalTypeValueBuilder.MONGOLIAN_VERT;
    if (value == TextVerticalTypeValueModel.WORD_ART_VERT_RTL) return TextVerticalTypeValueBuilder.WORD_ART_VERT_RTL;
    return null;
  }
}
