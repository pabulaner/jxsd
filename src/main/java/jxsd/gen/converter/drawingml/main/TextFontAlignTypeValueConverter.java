package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextFontAlignTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextFontAlignTypeValueModel;
import org.docx4j.dml.STTextFontAlignType;

/**
 * This is a generated enum class.
 */
public class TextFontAlignTypeValueConverter {
  private TextFontAlignTypeValueConverter() {
  }

  public static TextFontAlignTypeValueModel fromDocx4j(STTextFontAlignType value) {
    if (value == null) return null;
    if (value == TextFontAlignTypeValueBuilder.AUTO) return TextFontAlignTypeValueModel.AUTO;
    if (value == TextFontAlignTypeValueBuilder.T) return TextFontAlignTypeValueModel.T;
    if (value == TextFontAlignTypeValueBuilder.CTR) return TextFontAlignTypeValueModel.CTR;
    if (value == TextFontAlignTypeValueBuilder.BASE) return TextFontAlignTypeValueModel.BASE;
    if (value == TextFontAlignTypeValueBuilder.B) return TextFontAlignTypeValueModel.B;
    return null;
  }

  public static STTextFontAlignType toDocx4j(TextFontAlignTypeValueModel value) {
    if (value == null) return null;
    if (value == TextFontAlignTypeValueModel.AUTO) return TextFontAlignTypeValueBuilder.AUTO;
    if (value == TextFontAlignTypeValueModel.T) return TextFontAlignTypeValueBuilder.T;
    if (value == TextFontAlignTypeValueModel.CTR) return TextFontAlignTypeValueBuilder.CTR;
    if (value == TextFontAlignTypeValueModel.BASE) return TextFontAlignTypeValueBuilder.BASE;
    if (value == TextFontAlignTypeValueModel.B) return TextFontAlignTypeValueBuilder.B;
    return null;
  }
}
