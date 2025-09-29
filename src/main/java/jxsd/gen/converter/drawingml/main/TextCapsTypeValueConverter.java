package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.TextCapsTypeValueBuilder;
import jxsd.gen.model.drawingml.main.TextCapsTypeValueModel;
import org.docx4j.dml.STTextCapsType;

/**
 * This is a generated enum class.
 */
public class TextCapsTypeValueConverter {
  private TextCapsTypeValueConverter() {
  }

  public static TextCapsTypeValueModel fromDocx4j(STTextCapsType value) {
    if (value == null) return null;
    if (value == TextCapsTypeValueBuilder.NONE) return TextCapsTypeValueModel.NONE;
    if (value == TextCapsTypeValueBuilder.SMALL) return TextCapsTypeValueModel.SMALL;
    if (value == TextCapsTypeValueBuilder.ALL) return TextCapsTypeValueModel.ALL;
    return null;
  }

  public static STTextCapsType toDocx4j(TextCapsTypeValueModel value) {
    if (value == null) return null;
    if (value == TextCapsTypeValueModel.NONE) return TextCapsTypeValueBuilder.NONE;
    if (value == TextCapsTypeValueModel.SMALL) return TextCapsTypeValueBuilder.SMALL;
    if (value == TextCapsTypeValueModel.ALL) return TextCapsTypeValueBuilder.ALL;
    return null;
  }
}
