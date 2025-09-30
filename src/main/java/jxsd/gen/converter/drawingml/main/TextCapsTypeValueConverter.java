package jxsd.gen.converter.drawingml.main;

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
    if (value == STTextCapsType.NONE) return TextCapsTypeValueModel.NONE;
    if (value == STTextCapsType.SMALL) return TextCapsTypeValueModel.SMALL;
    if (value == STTextCapsType.ALL) return TextCapsTypeValueModel.ALL;
    return null;
  }

  public static STTextCapsType toDocx4j(TextCapsTypeValueModel value) {
    if (value == null) return null;
    if (value == TextCapsTypeValueModel.NONE) return STTextCapsType.NONE;
    if (value == TextCapsTypeValueModel.SMALL) return STTextCapsType.SMALL;
    if (value == TextCapsTypeValueModel.ALL) return STTextCapsType.ALL;
    return null;
  }
}
