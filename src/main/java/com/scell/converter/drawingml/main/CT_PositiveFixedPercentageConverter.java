package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveFixedPercentageModel;
import org.docx4j.dml.CTPositiveFixedPercentage;

public class CT_PositiveFixedPercentageConverter {
  private CT_PositiveFixedPercentageConverter() {
  }

  public static CT_PositiveFixedPercentageModel fromDocx4J(CTPositiveFixedPercentage value) {
    if (value == null) return null;
    return new CT_PositiveFixedPercentageModel(ST_PositiveFixedPercentageConverter.fromDocx4J(value.getVal()));
  }

  public static CTPositiveFixedPercentage toDocx4J(CT_PositiveFixedPercentageModel value) {
    return null;
  }
}
