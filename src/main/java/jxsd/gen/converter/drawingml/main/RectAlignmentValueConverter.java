package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.RectAlignmentValueModel;
import org.docx4j.dml.STRectAlignment;

/**
 * This is a generated enum class.
 */
public class RectAlignmentValueConverter {
  private RectAlignmentValueConverter() {
  }

  public static RectAlignmentValueModel fromDocx4j(STRectAlignment value) {
    if (value == null) return null;
    if (value == STRectAlignment.TL) return RectAlignmentValueModel.TL;
    if (value == STRectAlignment.T) return RectAlignmentValueModel.T;
    if (value == STRectAlignment.TR) return RectAlignmentValueModel.TR;
    if (value == STRectAlignment.L) return RectAlignmentValueModel.L;
    if (value == STRectAlignment.CTR) return RectAlignmentValueModel.CTR;
    if (value == STRectAlignment.R) return RectAlignmentValueModel.R;
    if (value == STRectAlignment.BL) return RectAlignmentValueModel.BL;
    if (value == STRectAlignment.B) return RectAlignmentValueModel.B;
    if (value == STRectAlignment.BR) return RectAlignmentValueModel.BR;
    return null;
  }

  public static STRectAlignment toDocx4j(RectAlignmentValueModel value) {
    if (value == null) return null;
    if (value == RectAlignmentValueModel.TL) return STRectAlignment.TL;
    if (value == RectAlignmentValueModel.T) return STRectAlignment.T;
    if (value == RectAlignmentValueModel.TR) return STRectAlignment.TR;
    if (value == RectAlignmentValueModel.L) return STRectAlignment.L;
    if (value == RectAlignmentValueModel.CTR) return STRectAlignment.CTR;
    if (value == RectAlignmentValueModel.R) return STRectAlignment.R;
    if (value == RectAlignmentValueModel.BL) return STRectAlignment.BL;
    if (value == RectAlignmentValueModel.B) return STRectAlignment.B;
    if (value == RectAlignmentValueModel.BR) return STRectAlignment.BR;
    return null;
  }
}
