package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PenAlignmentModel;
import org.docx4j.dml.STPenAlignment;

public class ST_PenAlignmentConverter {
  private ST_PenAlignmentConverter() {
  }

  public static ST_PenAlignmentModel fromDocx4J(STPenAlignment value) {
    if (value == null) return null;
    if (value == STPenAlignment.CTR) return ST_PenAlignmentModel.CTR;
    if (value == STPenAlignment.IN) return ST_PenAlignmentModel.IN;
    return null;
  }

  public static STPenAlignment toDocx4J(ST_PenAlignmentModel value) {
    return null;
  }
}
