package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextHorzOverflowTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextHorzOverflowTypeValueModel;
import org.docx4j.dml.STTextHorzOverflowType;

/**
 * This is a generated enum class.
 */
public class TextHorzOverflowTypeValueConverter {
  private TextHorzOverflowTypeValueConverter() {
  }

  public static TextHorzOverflowTypeValueModel fromDocx4j(STTextHorzOverflowType value) {
    if (value == null) return null;
    if (value == TextHorzOverflowTypeValueBuilder.OVERFLOW) return TextHorzOverflowTypeValueModel.OVERFLOW;
    if (value == TextHorzOverflowTypeValueBuilder.CLIP) return TextHorzOverflowTypeValueModel.CLIP;
    return null;
  }

  public static STTextHorzOverflowType toDocx4j(TextHorzOverflowTypeValueModel value) {
    if (value == null) return null;
    if (value == TextHorzOverflowTypeValueModel.OVERFLOW) return TextHorzOverflowTypeValueBuilder.OVERFLOW;
    if (value == TextHorzOverflowTypeValueModel.CLIP) return TextHorzOverflowTypeValueBuilder.CLIP;
    return null;
  }
}
