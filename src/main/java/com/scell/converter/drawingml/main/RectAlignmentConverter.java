package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.RectAlignmentModel;
import org.docx4j.dml.STRectAlignment;

public class RectAlignmentConverter {
  private RectAlignmentConverter() {
  }

  public static RectAlignmentModel fromDocx4J(STRectAlignment value) {
    if (value == null) return null;
    if (value == STRectAlignment.TL) return RectAlignmentModel.TL;
    if (value == STRectAlignment.T) return RectAlignmentModel.T;
    if (value == STRectAlignment.TR) return RectAlignmentModel.TR;
    if (value == STRectAlignment.L) return RectAlignmentModel.L;
    if (value == STRectAlignment.CTR) return RectAlignmentModel.CTR;
    if (value == STRectAlignment.R) return RectAlignmentModel.R;
    if (value == STRectAlignment.BL) return RectAlignmentModel.BL;
    if (value == STRectAlignment.B) return RectAlignmentModel.B;
    if (value == STRectAlignment.BR) return RectAlignmentModel.BR;
    return null;
  }
}
