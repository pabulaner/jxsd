package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.RelativeRectModel;
import org.docx4j.dml.CTRelativeRect;

public class RelativeRectConverter {
  private RelativeRectConverter() {
  }

  public static RelativeRectModel fromDocx4J(CTRelativeRect value) {
    if (value == null) return null;
    return new RelativeRectModel(PercentageValueConverter.fromDocx4J(value.getL()), PercentageValueConverter.fromDocx4J(value.getT()), PercentageValueConverter.fromDocx4J(value.getR()), PercentageValueConverter.fromDocx4J(value.getB()));
  }
}
