package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndTypeValueModel;
import org.docx4j.dml.STLineEndType;

/**
 * This is a generated enum class.
 */
public class LineEndTypeValueConverter {
  private LineEndTypeValueConverter() {
  }

  public static LineEndTypeValueModel fromDocx4j(STLineEndType value) {
    if (value == null) return null;
    if (value == STLineEndType.NONE) return LineEndTypeValueModel.NONE;
    if (value == STLineEndType.TRIANGLE) return LineEndTypeValueModel.TRIANGLE;
    if (value == STLineEndType.STEALTH) return LineEndTypeValueModel.STEALTH;
    if (value == STLineEndType.DIAMOND) return LineEndTypeValueModel.DIAMOND;
    if (value == STLineEndType.OVAL) return LineEndTypeValueModel.OVAL;
    if (value == STLineEndType.ARROW) return LineEndTypeValueModel.ARROW;
    return null;
  }

  public static STLineEndType toDocx4j(LineEndTypeValueModel value) {
    if (value == null) return null;
    if (value == LineEndTypeValueModel.NONE) return STLineEndType.NONE;
    if (value == LineEndTypeValueModel.TRIANGLE) return STLineEndType.TRIANGLE;
    if (value == LineEndTypeValueModel.STEALTH) return STLineEndType.STEALTH;
    if (value == LineEndTypeValueModel.DIAMOND) return STLineEndType.DIAMOND;
    if (value == LineEndTypeValueModel.OVAL) return STLineEndType.OVAL;
    if (value == LineEndTypeValueModel.ARROW) return STLineEndType.ARROW;
    return null;
  }
}
