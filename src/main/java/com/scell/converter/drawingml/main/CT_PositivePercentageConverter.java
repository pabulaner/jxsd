package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PositivePercentageModel;
import org.docx4j.dml.CTPositivePercentage;

public class CT_PositivePercentageConverter {
  private CT_PositivePercentageConverter() {
  }

  public static CT_PositivePercentageModel fromDocx4J(CTPositivePercentage value) {
    if (value == null) return null;
    return new CT_PositivePercentageModel(ST_PositivePercentageConverter.fromDocx4J(value.getVal()));
  }

  public static CTPositivePercentage toDocx4J(CT_PositivePercentageModel value) {
    return null;
  }
}
