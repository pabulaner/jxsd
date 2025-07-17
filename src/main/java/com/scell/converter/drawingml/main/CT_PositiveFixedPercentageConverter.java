package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveFixedPercentageModel;
import org.docx4j.dml.CTPositiveFixedPercentage;

public class CT_PositiveFixedPercentageConverter {
  private CT_PositiveFixedPercentageConverter() {
  }

  public static CT_PositiveFixedPercentageModel fromDocx4j(CTPositiveFixedPercentage value) {
    if (value == null) return null;
    return new CT_PositiveFixedPercentageModel(ST_PositiveFixedPercentageConverter.fromDocx4j(value.getVal()));
  }

  public static CTPositiveFixedPercentage toDocx4j(CT_PositiveFixedPercentageModel value) {
    return null;
  }
}
