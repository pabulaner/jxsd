package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextHorzOverflowType.OVERFLOW) return TextHorzOverflowTypeValueModel.OVERFLOW;
    if (value == STTextHorzOverflowType.CLIP) return TextHorzOverflowTypeValueModel.CLIP;
    return null;
  }

  public static STTextHorzOverflowType toDocx4j(TextHorzOverflowTypeValueModel value) {
    if (value == null) return null;
    if (value == TextHorzOverflowTypeValueModel.OVERFLOW) return STTextHorzOverflowType.OVERFLOW;
    if (value == TextHorzOverflowTypeValueModel.CLIP) return STTextHorzOverflowType.CLIP;
    return null;
  }
}
