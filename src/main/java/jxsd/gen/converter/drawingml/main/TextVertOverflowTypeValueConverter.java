package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextVertOverflowTypeValueModel;
import org.docx4j.dml.STTextVertOverflowType;

/**
 * This is a generated enum class.
 */
public class TextVertOverflowTypeValueConverter {
  private TextVertOverflowTypeValueConverter() {
  }

  public static TextVertOverflowTypeValueModel fromDocx4j(STTextVertOverflowType value) {
    if (value == null) return null;
    if (value == STTextVertOverflowType.OVERFLOW) return TextVertOverflowTypeValueModel.OVERFLOW;
    if (value == STTextVertOverflowType.ELLIPSIS) return TextVertOverflowTypeValueModel.ELLIPSIS;
    if (value == STTextVertOverflowType.CLIP) return TextVertOverflowTypeValueModel.CLIP;
    return null;
  }

  public static STTextVertOverflowType toDocx4j(TextVertOverflowTypeValueModel value) {
    if (value == null) return null;
    if (value == TextVertOverflowTypeValueModel.OVERFLOW) return STTextVertOverflowType.OVERFLOW;
    if (value == TextVertOverflowTypeValueModel.ELLIPSIS) return STTextVertOverflowType.ELLIPSIS;
    if (value == TextVertOverflowTypeValueModel.CLIP) return STTextVertOverflowType.CLIP;
    return null;
  }
}
