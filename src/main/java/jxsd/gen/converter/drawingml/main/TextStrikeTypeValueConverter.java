package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextStrikeTypeValueBuilder;
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
    if (value == TextStrikeTypeValueBuilder.NO_STRIKE) return TextStrikeTypeValueModel.NO_STRIKE;
    if (value == TextStrikeTypeValueBuilder.SNG_STRIKE) return TextStrikeTypeValueModel.SNG_STRIKE;
    if (value == TextStrikeTypeValueBuilder.DBL_STRIKE) return TextStrikeTypeValueModel.DBL_STRIKE;
    return null;
  }

  public static STTextStrikeType toDocx4j(TextStrikeTypeValueModel value) {
    if (value == null) return null;
    if (value == TextStrikeTypeValueModel.NO_STRIKE) return TextStrikeTypeValueBuilder.NO_STRIKE;
    if (value == TextStrikeTypeValueModel.SNG_STRIKE) return TextStrikeTypeValueBuilder.SNG_STRIKE;
    if (value == TextStrikeTypeValueModel.DBL_STRIKE) return TextStrikeTypeValueBuilder.DBL_STRIKE;
    return null;
  }
}
