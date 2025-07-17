package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_PercentageModel;
import org.docx4j.dml.CTPercentage;

public class CT_PercentageConverter {
  private CT_PercentageConverter() {
  }

  public static CT_PercentageModel fromDocx4j(CTPercentage value) {
    if (value == null) return null;
    return new CT_PercentageModel(ST_PercentageConverter.fromDocx4j(value.getVal()));
  }

  public static CTPercentage toDocx4j(CT_PercentageModel value) {
    return null;
  }
}
