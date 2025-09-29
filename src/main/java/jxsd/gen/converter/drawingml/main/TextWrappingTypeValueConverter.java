package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextWrappingTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextWrappingTypeValueModel;
import org.docx4j.dml.STTextWrappingType;

/**
 * This is a generated enum class.
 */
public class TextWrappingTypeValueConverter {
  private TextWrappingTypeValueConverter() {
  }

  public static TextWrappingTypeValueModel fromDocx4j(STTextWrappingType value) {
    if (value == null) return null;
    if (value == TextWrappingTypeValueBuilder.NONE) return TextWrappingTypeValueModel.NONE;
    if (value == TextWrappingTypeValueBuilder.SQUARE) return TextWrappingTypeValueModel.SQUARE;
    return null;
  }

  public static STTextWrappingType toDocx4j(TextWrappingTypeValueModel value) {
    if (value == null) return null;
    if (value == TextWrappingTypeValueModel.NONE) return TextWrappingTypeValueBuilder.NONE;
    if (value == TextWrappingTypeValueModel.SQUARE) return TextWrappingTypeValueBuilder.SQUARE;
    return null;
  }
}
