package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FixedPercentageModel;
import org.docx4j.dml.CTFixedPercentage;

public class CT_FixedPercentageConverter {
  private CT_FixedPercentageConverter() {
  }

  public static CT_FixedPercentageModel fromDocx4j(CTFixedPercentage value) {
    if (value == null) return null;
    return new CT_FixedPercentageModel(ST_FixedPercentageConverter.fromDocx4j(value.getVal()));
  }

  public static CTFixedPercentage toDocx4j(CT_FixedPercentageModel value) {
    return null;
  }
}
