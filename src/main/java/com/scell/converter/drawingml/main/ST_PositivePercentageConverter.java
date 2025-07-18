package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PositivePercentageModel;

public class ST_PositivePercentageConverter {
  private ST_PositivePercentageConverter() {
  }

  public static ST_PositivePercentageModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PositivePercentageModel(value);
  }

  public static Long toDocx4J(ST_PositivePercentageModel value) {
    return null;
  }
}
