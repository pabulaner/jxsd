package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.RectAlignmentValueModel;
import org.docx4j.dml.STRectAlignment;

public class RectAlignmentValueConverter {
  private RectAlignmentValueConverter() {
  }

  public static RectAlignmentValueModel fromDocx4J(STRectAlignment value) {
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
}
