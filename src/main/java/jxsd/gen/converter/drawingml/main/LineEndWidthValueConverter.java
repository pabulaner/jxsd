package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.LineEndWidthValueBuilder;
import jxsd.gen.model.drawingml.main.LineEndWidthValueModel;
import org.docx4j.dml.STLineEndWidth;

/**
 * This is a generated enum class.
 */
public class LineEndWidthValueConverter {
  private LineEndWidthValueConverter() {
  }

  public static LineEndWidthValueModel fromDocx4j(STLineEndWidth value) {
    if (value == null) return null;
    if (value == LineEndWidthValueBuilder.SM) return LineEndWidthValueModel.SM;
    if (value == LineEndWidthValueBuilder.MED) return LineEndWidthValueModel.MED;
    if (value == LineEndWidthValueBuilder.LG) return LineEndWidthValueModel.LG;
    return null;
  }

  public static STLineEndWidth toDocx4j(LineEndWidthValueModel value) {
    if (value == null) return null;
    if (value == LineEndWidthValueModel.SM) return LineEndWidthValueBuilder.SM;
    if (value == LineEndWidthValueModel.MED) return LineEndWidthValueBuilder.MED;
    if (value == LineEndWidthValueModel.LG) return LineEndWidthValueBuilder.LG;
    return null;
  }
}
