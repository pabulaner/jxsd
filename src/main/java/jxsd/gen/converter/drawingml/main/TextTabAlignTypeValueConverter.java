package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextTabAlignTypeValueModel;
import org.docx4j.dml.STTextTabAlignType;

/**
 * This is a generated enum class.
 */
public class TextTabAlignTypeValueConverter {
  private TextTabAlignTypeValueConverter() {
  }

  public static TextTabAlignTypeValueModel fromDocx4j(STTextTabAlignType value) {
    if (value == null) return null;
    if (value == STTextTabAlignType.L) return TextTabAlignTypeValueModel.L;
    if (value == STTextTabAlignType.CTR) return TextTabAlignTypeValueModel.CTR;
    if (value == STTextTabAlignType.R) return TextTabAlignTypeValueModel.R;
    if (value == STTextTabAlignType.DEC) return TextTabAlignTypeValueModel.DEC;
    return null;
  }

  public static STTextTabAlignType toDocx4j(TextTabAlignTypeValueModel value) {
    if (value == null) return null;
    if (value == TextTabAlignTypeValueModel.L) return STTextTabAlignType.L;
    if (value == TextTabAlignTypeValueModel.CTR) return STTextTabAlignType.CTR;
    if (value == TextTabAlignTypeValueModel.R) return STTextTabAlignType.R;
    if (value == TextTabAlignTypeValueModel.DEC) return STTextTabAlignType.DEC;
    return null;
  }
}
