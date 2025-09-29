package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextTabAlignTypeValueBuilder;
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
    if (value == TextTabAlignTypeValueBuilder.L) return TextTabAlignTypeValueModel.L;
    if (value == TextTabAlignTypeValueBuilder.CTR) return TextTabAlignTypeValueModel.CTR;
    if (value == TextTabAlignTypeValueBuilder.R) return TextTabAlignTypeValueModel.R;
    if (value == TextTabAlignTypeValueBuilder.DEC) return TextTabAlignTypeValueModel.DEC;
    return null;
  }

  public static STTextTabAlignType toDocx4j(TextTabAlignTypeValueModel value) {
    if (value == null) return null;
    if (value == TextTabAlignTypeValueModel.L) return TextTabAlignTypeValueBuilder.L;
    if (value == TextTabAlignTypeValueModel.CTR) return TextTabAlignTypeValueBuilder.CTR;
    if (value == TextTabAlignTypeValueModel.R) return TextTabAlignTypeValueBuilder.R;
    if (value == TextTabAlignTypeValueModel.DEC) return TextTabAlignTypeValueBuilder.DEC;
    return null;
  }
}
