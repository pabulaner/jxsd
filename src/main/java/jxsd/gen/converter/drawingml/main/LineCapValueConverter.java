package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineCapValueBuilder;
import jxsd.gen.model.drawingml.main.LineCapValueModel;
import org.docx4j.dml.STLineCap;

/**
 * This is a generated enum class.
 */
public class LineCapValueConverter {
  private LineCapValueConverter() {
  }

  public static LineCapValueModel fromDocx4j(STLineCap value) {
    if (value == null) return null;
    if (value == LineCapValueBuilder.RND) return LineCapValueModel.RND;
    if (value == LineCapValueBuilder.SQ) return LineCapValueModel.SQ;
    if (value == LineCapValueBuilder.FLAT) return LineCapValueModel.FLAT;
    return null;
  }

  public static STLineCap toDocx4j(LineCapValueModel value) {
    if (value == null) return null;
    if (value == LineCapValueModel.RND) return LineCapValueBuilder.RND;
    if (value == LineCapValueModel.SQ) return LineCapValueBuilder.SQ;
    if (value == LineCapValueModel.FLAT) return LineCapValueBuilder.FLAT;
    return null;
  }
}
