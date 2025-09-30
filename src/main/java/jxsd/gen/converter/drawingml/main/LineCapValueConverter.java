package jxsd.gen.converter.drawingml.main;

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
    if (value == STLineCap.RND) return LineCapValueModel.RND;
    if (value == STLineCap.SQ) return LineCapValueModel.SQ;
    if (value == STLineCap.FLAT) return LineCapValueModel.FLAT;
    return null;
  }

  public static STLineCap toDocx4j(LineCapValueModel value) {
    if (value == null) return null;
    if (value == LineCapValueModel.RND) return STLineCap.RND;
    if (value == LineCapValueModel.SQ) return STLineCap.SQ;
    if (value == LineCapValueModel.FLAT) return STLineCap.FLAT;
    return null;
  }
}
