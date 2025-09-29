package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineEndLengthValueBuilder;
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
    if (value == LineEndLengthValueBuilder.SM) return LineEndLengthValueModel.SM;
    if (value == LineEndLengthValueBuilder.MED) return LineEndLengthValueModel.MED;
    if (value == LineEndLengthValueBuilder.LG) return LineEndLengthValueModel.LG;
    return null;
  }

  public static STLineEndLength toDocx4j(LineEndLengthValueModel value) {
    if (value == null) return null;
    if (value == LineEndLengthValueModel.SM) return LineEndLengthValueBuilder.SM;
    if (value == LineEndLengthValueModel.MED) return LineEndLengthValueBuilder.MED;
    if (value == LineEndLengthValueModel.LG) return LineEndLengthValueBuilder.LG;
    return null;
  }
}
