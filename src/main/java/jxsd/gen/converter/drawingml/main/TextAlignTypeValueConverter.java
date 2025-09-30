package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextAlignTypeValueModel;
import org.docx4j.dml.STTextAlignType;

/**
 * This is a generated enum class.
 */
public class TextAlignTypeValueConverter {
  private TextAlignTypeValueConverter() {
  }

  public static TextAlignTypeValueModel fromDocx4j(STTextAlignType value) {
    if (value == null) return null;
    if (value == STTextAlignType.L) return TextAlignTypeValueModel.L;
    if (value == STTextAlignType.CTR) return TextAlignTypeValueModel.CTR;
    if (value == STTextAlignType.R) return TextAlignTypeValueModel.R;
    if (value == STTextAlignType.JUST) return TextAlignTypeValueModel.JUST;
    if (value == STTextAlignType.JUST_LOW) return TextAlignTypeValueModel.JUST_LOW;
    if (value == STTextAlignType.DIST) return TextAlignTypeValueModel.DIST;
    if (value == STTextAlignType.THAI_DIST) return TextAlignTypeValueModel.THAI_DIST;
    return null;
  }

  public static STTextAlignType toDocx4j(TextAlignTypeValueModel value) {
    if (value == null) return null;
    if (value == TextAlignTypeValueModel.L) return STTextAlignType.L;
    if (value == TextAlignTypeValueModel.CTR) return STTextAlignType.CTR;
    if (value == TextAlignTypeValueModel.R) return STTextAlignType.R;
    if (value == TextAlignTypeValueModel.JUST) return STTextAlignType.JUST;
    if (value == TextAlignTypeValueModel.JUST_LOW) return STTextAlignType.JUST_LOW;
    if (value == TextAlignTypeValueModel.DIST) return STTextAlignType.DIST;
    if (value == TextAlignTypeValueModel.THAI_DIST) return STTextAlignType.THAI_DIST;
    return null;
  }
}
