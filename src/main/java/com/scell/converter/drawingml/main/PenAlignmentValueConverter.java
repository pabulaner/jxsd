package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PenAlignmentValueModel;
import org.docx4j.dml.STPenAlignment;

public class PenAlignmentValueConverter {
  private PenAlignmentValueConverter() {
  }

  public static PenAlignmentValueModel fromDocx4J(STPenAlignment value) {
    if (value == null) return null;
    if (value == STPenAlignment.CTR) return PenAlignmentValueModel.CTR;
    if (value == STPenAlignment.IN) return PenAlignmentValueModel.IN;
    return null;
  }
}
