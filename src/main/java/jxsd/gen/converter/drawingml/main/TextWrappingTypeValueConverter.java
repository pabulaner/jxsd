package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextWrappingType.NONE) return TextWrappingTypeValueModel.NONE;
    if (value == STTextWrappingType.SQUARE) return TextWrappingTypeValueModel.SQUARE;
    return null;
  }

  public static STTextWrappingType toDocx4j(TextWrappingTypeValueModel value) {
    if (value == null) return null;
    if (value == TextWrappingTypeValueModel.NONE) return STTextWrappingType.NONE;
    if (value == TextWrappingTypeValueModel.SQUARE) return STTextWrappingType.SQUARE;
    return null;
  }
}
