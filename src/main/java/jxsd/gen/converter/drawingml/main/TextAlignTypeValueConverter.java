package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextAlignTypeValueBuilder;
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
    if (value == TextAlignTypeValueBuilder.L) return TextAlignTypeValueModel.L;
    if (value == TextAlignTypeValueBuilder.CTR) return TextAlignTypeValueModel.CTR;
    if (value == TextAlignTypeValueBuilder.R) return TextAlignTypeValueModel.R;
    if (value == TextAlignTypeValueBuilder.JUST) return TextAlignTypeValueModel.JUST;
    if (value == TextAlignTypeValueBuilder.JUST_LOW) return TextAlignTypeValueModel.JUST_LOW;
    if (value == TextAlignTypeValueBuilder.DIST) return TextAlignTypeValueModel.DIST;
    if (value == TextAlignTypeValueBuilder.THAI_DIST) return TextAlignTypeValueModel.THAI_DIST;
    return null;
  }

  public static STTextAlignType toDocx4j(TextAlignTypeValueModel value) {
    if (value == null) return null;
    if (value == TextAlignTypeValueModel.L) return TextAlignTypeValueBuilder.L;
    if (value == TextAlignTypeValueModel.CTR) return TextAlignTypeValueBuilder.CTR;
    if (value == TextAlignTypeValueModel.R) return TextAlignTypeValueBuilder.R;
    if (value == TextAlignTypeValueModel.JUST) return TextAlignTypeValueBuilder.JUST;
    if (value == TextAlignTypeValueModel.JUST_LOW) return TextAlignTypeValueBuilder.JUST_LOW;
    if (value == TextAlignTypeValueModel.DIST) return TextAlignTypeValueBuilder.DIST;
    if (value == TextAlignTypeValueModel.THAI_DIST) return TextAlignTypeValueBuilder.THAI_DIST;
    return null;
  }
}
