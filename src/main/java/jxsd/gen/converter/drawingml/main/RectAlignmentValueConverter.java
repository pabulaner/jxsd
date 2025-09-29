package jxsd.gen.converter.drawingml.main;

import jxsd.gen.builder.drawingml.main.RectAlignmentValueBuilder;
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
    if (value == RectAlignmentValueBuilder.TL) return RectAlignmentValueModel.TL;
    if (value == RectAlignmentValueBuilder.T) return RectAlignmentValueModel.T;
    if (value == RectAlignmentValueBuilder.TR) return RectAlignmentValueModel.TR;
    if (value == RectAlignmentValueBuilder.L) return RectAlignmentValueModel.L;
    if (value == RectAlignmentValueBuilder.CTR) return RectAlignmentValueModel.CTR;
    if (value == RectAlignmentValueBuilder.R) return RectAlignmentValueModel.R;
    if (value == RectAlignmentValueBuilder.BL) return RectAlignmentValueModel.BL;
    if (value == RectAlignmentValueBuilder.B) return RectAlignmentValueModel.B;
    if (value == RectAlignmentValueBuilder.BR) return RectAlignmentValueModel.BR;
    return null;
  }

  public static STRectAlignment toDocx4j(RectAlignmentValueModel value) {
    if (value == null) return null;
    if (value == RectAlignmentValueModel.TL) return RectAlignmentValueBuilder.TL;
    if (value == RectAlignmentValueModel.T) return RectAlignmentValueBuilder.T;
    if (value == RectAlignmentValueModel.TR) return RectAlignmentValueBuilder.TR;
    if (value == RectAlignmentValueModel.L) return RectAlignmentValueBuilder.L;
    if (value == RectAlignmentValueModel.CTR) return RectAlignmentValueBuilder.CTR;
    if (value == RectAlignmentValueModel.R) return RectAlignmentValueBuilder.R;
    if (value == RectAlignmentValueModel.BL) return RectAlignmentValueBuilder.BL;
    if (value == RectAlignmentValueModel.B) return RectAlignmentValueBuilder.B;
    if (value == RectAlignmentValueModel.BR) return RectAlignmentValueBuilder.BR;
    return null;
  }
}
