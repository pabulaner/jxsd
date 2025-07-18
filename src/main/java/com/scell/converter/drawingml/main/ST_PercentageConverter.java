package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PercentageModel;

public class ST_PercentageConverter {
  private ST_PercentageConverter() {
  }

  public static ST_PercentageModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PercentageModel(value);
  }

  public static Long toDocx4J(ST_PercentageModel value) {
    return null;
  }
}
