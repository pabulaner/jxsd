package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextFontAlignType.AUTO) return TextFontAlignTypeValueModel.AUTO;
    if (value == STTextFontAlignType.T) return TextFontAlignTypeValueModel.T;
    if (value == STTextFontAlignType.CTR) return TextFontAlignTypeValueModel.CTR;
    if (value == STTextFontAlignType.BASE) return TextFontAlignTypeValueModel.BASE;
    if (value == STTextFontAlignType.B) return TextFontAlignTypeValueModel.B;
    return null;
  }

  public static STTextFontAlignType toDocx4j(TextFontAlignTypeValueModel value) {
    if (value == null) return null;
    if (value == TextFontAlignTypeValueModel.AUTO) return STTextFontAlignType.AUTO;
    if (value == TextFontAlignTypeValueModel.T) return STTextFontAlignType.T;
    if (value == TextFontAlignTypeValueModel.CTR) return STTextFontAlignType.CTR;
    if (value == TextFontAlignTypeValueModel.BASE) return STTextFontAlignType.BASE;
    if (value == TextFontAlignTypeValueModel.B) return STTextFontAlignType.B;
    return null;
  }
}
