package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextVertOverflowTypeValueBuilder;
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
    if (value == TextVertOverflowTypeValueBuilder.OVERFLOW) return TextVertOverflowTypeValueModel.OVERFLOW;
    if (value == TextVertOverflowTypeValueBuilder.ELLIPSIS) return TextVertOverflowTypeValueModel.ELLIPSIS;
    if (value == TextVertOverflowTypeValueBuilder.CLIP) return TextVertOverflowTypeValueModel.CLIP;
    return null;
  }

  public static STTextVertOverflowType toDocx4j(TextVertOverflowTypeValueModel value) {
    if (value == null) return null;
    if (value == TextVertOverflowTypeValueModel.OVERFLOW) return TextVertOverflowTypeValueBuilder.OVERFLOW;
    if (value == TextVertOverflowTypeValueModel.ELLIPSIS) return TextVertOverflowTypeValueBuilder.ELLIPSIS;
    if (value == TextVertOverflowTypeValueModel.CLIP) return TextVertOverflowTypeValueBuilder.CLIP;
    return null;
  }
}
