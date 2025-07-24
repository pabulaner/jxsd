package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PositivePercentageModel;
import org.docx4j.dml.CTPositivePercentage;

public class PositivePercentageConverter {
  private PositivePercentageConverter() {
  }

  public static PositivePercentageModel fromDocx4J(CTPositivePercentage value) {
    if (value == null) return null;
    return new PositivePercentageModel(PositivePercentageConverter.fromDocx4J(value.getVal()));
  }
}
