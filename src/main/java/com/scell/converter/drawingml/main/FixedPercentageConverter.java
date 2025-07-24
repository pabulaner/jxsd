package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageModel;
import org.docx4j.dml.CTFixedPercentage;

public class FixedPercentageConverter {
  private FixedPercentageConverter() {
  }

  public static FixedPercentageModel fromDocx4J(CTFixedPercentage value) {
    if (value == null) return null;
    return new FixedPercentageModel(FixedPercentageConverter.fromDocx4J(value.getVal()));
  }
}
