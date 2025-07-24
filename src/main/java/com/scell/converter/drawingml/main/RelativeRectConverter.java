package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.RelativeRectModel;
import org.docx4j.dml.CTRelativeRect;

public class RelativeRectConverter {
  private RelativeRectConverter() {
  }

  public static RelativeRectModel fromDocx4J(CTRelativeRect value) {
    if (value == null) return null;
    return new RelativeRectModel(PercentageConverter.fromDocx4J(value.getL()), PercentageConverter.fromDocx4J(value.getT()), PercentageConverter.fromDocx4J(value.getR()), PercentageConverter.fromDocx4J(value.getB()));
  }
}
