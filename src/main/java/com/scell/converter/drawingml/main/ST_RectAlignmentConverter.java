package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_RectAlignmentModel;
import org.docx4j.dml.STRectAlignment;

public class ST_RectAlignmentConverter {
  private ST_RectAlignmentConverter() {
  }

  public static ST_RectAlignmentModel fromDocx4J(STRectAlignment value) {
    if (value == null) return null;
    if (value == STRectAlignment.TL) return ST_RectAlignmentModel.TL;
    if (value == STRectAlignment.T) return ST_RectAlignmentModel.T;
    if (value == STRectAlignment.TR) return ST_RectAlignmentModel.TR;
    if (value == STRectAlignment.L) return ST_RectAlignmentModel.L;
    if (value == STRectAlignment.CTR) return ST_RectAlignmentModel.CTR;
    if (value == STRectAlignment.R) return ST_RectAlignmentModel.R;
    if (value == STRectAlignment.BL) return ST_RectAlignmentModel.BL;
    if (value == STRectAlignment.B) return ST_RectAlignmentModel.B;
    if (value == STRectAlignment.BR) return ST_RectAlignmentModel.BR;
    return null;
  }

  public static STRectAlignment toDocx4J(ST_RectAlignmentModel value) {
    return null;
  }
}
