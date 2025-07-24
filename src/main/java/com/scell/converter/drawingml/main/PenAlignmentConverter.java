package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PenAlignmentModel;
import org.docx4j.dml.STPenAlignment;

public class PenAlignmentConverter {
  private PenAlignmentConverter() {
  }

  public static PenAlignmentModel fromDocx4J(STPenAlignment value) {
    if (value == null) return null;
    if (value == STPenAlignment.CTR) return PenAlignmentModel.CTR;
    if (value == STPenAlignment.IN) return PenAlignmentModel.IN;
    return null;
  }
}
