package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextStrikeTypeValueModel;
import org.docx4j.dml.STTextStrikeType;

/**
 * This is a generated enum class.
 */
public class TextStrikeTypeValueConverter {
  private TextStrikeTypeValueConverter() {
  }

  public static TextStrikeTypeValueModel fromDocx4j(STTextStrikeType value) {
    if (value == null) return null;
    if (value == STTextStrikeType.NO_STRIKE) return TextStrikeTypeValueModel.NO_STRIKE;
    if (value == STTextStrikeType.SNG_STRIKE) return TextStrikeTypeValueModel.SNG_STRIKE;
    if (value == STTextStrikeType.DBL_STRIKE) return TextStrikeTypeValueModel.DBL_STRIKE;
    return null;
  }

  public static STTextStrikeType toDocx4j(TextStrikeTypeValueModel value) {
    if (value == null) return null;
    if (value == TextStrikeTypeValueModel.NO_STRIKE) return STTextStrikeType.NO_STRIKE;
    if (value == TextStrikeTypeValueModel.SNG_STRIKE) return STTextStrikeType.SNG_STRIKE;
    if (value == TextStrikeTypeValueModel.DBL_STRIKE) return STTextStrikeType.DBL_STRIKE;
    return null;
  }
}
