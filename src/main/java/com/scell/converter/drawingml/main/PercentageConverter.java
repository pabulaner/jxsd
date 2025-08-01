package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PercentageModel;
import org.docx4j.dml.CTPercentage;

public class PercentageConverter {
  private PercentageConverter() {
  }

  public static PercentageModel fromDocx4J(CTPercentage value) {
    if (value == null) return null;
    return new PercentageModel(PercentageValueConverter.fromDocx4J(value.getVal()));
  }
}
