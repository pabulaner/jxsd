package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextVerticalType.HORZ) return TextVerticalTypeValueModel.HORZ;
    if (value == STTextVerticalType.VERT) return TextVerticalTypeValueModel.VERT;
    if (value == STTextVerticalType.VERT_270) return TextVerticalTypeValueModel.VERT_270;
    if (value == STTextVerticalType.WORD_ART_VERT) return TextVerticalTypeValueModel.WORD_ART_VERT;
    if (value == STTextVerticalType.EA_VERT) return TextVerticalTypeValueModel.EA_VERT;
    if (value == STTextVerticalType.MONGOLIAN_VERT) return TextVerticalTypeValueModel.MONGOLIAN_VERT;
    if (value == STTextVerticalType.WORD_ART_VERT_RTL) return TextVerticalTypeValueModel.WORD_ART_VERT_RTL;
    return null;
  }

  public static STTextVerticalType toDocx4j(TextVerticalTypeValueModel value) {
    if (value == null) return null;
    if (value == TextVerticalTypeValueModel.HORZ) return STTextVerticalType.HORZ;
    if (value == TextVerticalTypeValueModel.VERT) return STTextVerticalType.VERT;
    if (value == TextVerticalTypeValueModel.VERT_270) return STTextVerticalType.VERT_270;
    if (value == TextVerticalTypeValueModel.WORD_ART_VERT) return STTextVerticalType.WORD_ART_VERT;
    if (value == TextVerticalTypeValueModel.EA_VERT) return STTextVerticalType.EA_VERT;
    if (value == TextVerticalTypeValueModel.MONGOLIAN_VERT) return STTextVerticalType.MONGOLIAN_VERT;
    if (value == TextVerticalTypeValueModel.WORD_ART_VERT_RTL) return STTextVerticalType.WORD_ART_VERT_RTL;
    return null;
  }
}
