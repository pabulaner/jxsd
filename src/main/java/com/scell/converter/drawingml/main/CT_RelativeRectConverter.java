package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_RelativeRectModel;
import org.docx4j.dml.CTRelativeRect;

public class CT_RelativeRectConverter {
  private CT_RelativeRectConverter() {
  }

  public static CT_RelativeRectModel fromDocx4J(CTRelativeRect value) {
    if (value == null) return null;
    return new CT_RelativeRectModel(ST_PercentageConverter.fromDocx4J(value.getL()), ST_PercentageConverter.fromDocx4J(value.getT()), ST_PercentageConverter.fromDocx4J(value.getR()), ST_PercentageConverter.fromDocx4J(value.getB()));
  }

  public static CTRelativeRect toDocx4J(CT_RelativeRectModel value) {
    return null;
  }
}
