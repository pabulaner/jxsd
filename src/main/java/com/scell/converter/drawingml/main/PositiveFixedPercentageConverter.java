package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedPercentageModel;
import org.docx4j.dml.CTPositiveFixedPercentage;

public class PositiveFixedPercentageConverter {
  private PositiveFixedPercentageConverter() {
  }

  public static PositiveFixedPercentageModel fromDocx4J(CTPositiveFixedPercentage value) {
    if (value == null) return null;
    return new PositiveFixedPercentageModel(PositiveFixedPercentageConverter.fromDocx4J(value.getVal()));
  }
}
