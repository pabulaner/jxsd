package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineEndTypeValueBuilder;
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
    if (value == LineEndTypeValueBuilder.NONE) return LineEndTypeValueModel.NONE;
    if (value == LineEndTypeValueBuilder.TRIANGLE) return LineEndTypeValueModel.TRIANGLE;
    if (value == LineEndTypeValueBuilder.STEALTH) return LineEndTypeValueModel.STEALTH;
    if (value == LineEndTypeValueBuilder.DIAMOND) return LineEndTypeValueModel.DIAMOND;
    if (value == LineEndTypeValueBuilder.OVAL) return LineEndTypeValueModel.OVAL;
    if (value == LineEndTypeValueBuilder.ARROW) return LineEndTypeValueModel.ARROW;
    return null;
  }

  public static STLineEndType toDocx4j(LineEndTypeValueModel value) {
    if (value == null) return null;
    if (value == LineEndTypeValueModel.NONE) return LineEndTypeValueBuilder.NONE;
    if (value == LineEndTypeValueModel.TRIANGLE) return LineEndTypeValueBuilder.TRIANGLE;
    if (value == LineEndTypeValueModel.STEALTH) return LineEndTypeValueBuilder.STEALTH;
    if (value == LineEndTypeValueModel.DIAMOND) return LineEndTypeValueBuilder.DIAMOND;
    if (value == LineEndTypeValueModel.OVAL) return LineEndTypeValueBuilder.OVAL;
    if (value == LineEndTypeValueModel.ARROW) return LineEndTypeValueBuilder.ARROW;
    return null;
  }
}
