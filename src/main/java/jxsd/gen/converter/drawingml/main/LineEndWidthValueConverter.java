package jxsd.gen.converter.drawingml.main;

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
    if (value == STLineEndWidth.SM) return LineEndWidthValueModel.SM;
    if (value == STLineEndWidth.MED) return LineEndWidthValueModel.MED;
    if (value == STLineEndWidth.LG) return LineEndWidthValueModel.LG;
    return null;
  }

  public static STLineEndWidth toDocx4j(LineEndWidthValueModel value) {
    if (value == null) return null;
    if (value == LineEndWidthValueModel.SM) return STLineEndWidth.SM;
    if (value == LineEndWidthValueModel.MED) return STLineEndWidth.MED;
    if (value == LineEndWidthValueModel.LG) return STLineEndWidth.LG;
    return null;
  }
}
