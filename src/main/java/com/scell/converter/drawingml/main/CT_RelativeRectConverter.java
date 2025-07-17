package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_RelativeRectModel;
import org.docx4j.dml.CTRelativeRect;

public class CT_RelativeRectConverter {
  private CT_RelativeRectConverter() {
  }

  public static CT_RelativeRectModel fromDocx4j(CTRelativeRect value) {
    if (value == null) return null;
    return new CT_RelativeRectModel(ST_PercentageConverter.fromDocx4j(value.getL()), ST_PercentageConverter.fromDocx4j(value.getT()), ST_PercentageConverter.fromDocx4j(value.getR()), ST_PercentageConverter.fromDocx4j(value.getB()));
  }

  public static CTRelativeRect toDocx4j(CT_RelativeRectModel value) {
    return null;
  }
}
