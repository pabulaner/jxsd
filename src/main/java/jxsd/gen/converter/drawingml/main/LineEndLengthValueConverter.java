package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.LineEndLengthValueModel;
import org.docx4j.dml.STLineEndLength;

/**
 * This is a generated enum class.
 */
public class LineEndLengthValueConverter {
  private LineEndLengthValueConverter() {
  }

  public static LineEndLengthValueModel fromDocx4j(STLineEndLength value) {
    if (value == null) return null;
    if (value == STLineEndLength.SM) return LineEndLengthValueModel.SM;
    if (value == STLineEndLength.MED) return LineEndLengthValueModel.MED;
    if (value == STLineEndLength.LG) return LineEndLengthValueModel.LG;
    return null;
  }

  public static STLineEndLength toDocx4j(LineEndLengthValueModel value) {
    if (value == null) return null;
    if (value == LineEndLengthValueModel.SM) return STLineEndLength.SM;
    if (value == LineEndLengthValueModel.MED) return STLineEndLength.MED;
    if (value == LineEndLengthValueModel.LG) return STLineEndLength.LG;
    return null;
  }
}
