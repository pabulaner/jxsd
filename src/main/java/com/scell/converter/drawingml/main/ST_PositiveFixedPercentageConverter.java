package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;

public class ST_PositiveFixedPercentageConverter {
  private ST_PositiveFixedPercentageConverter() {
  }

  public static ST_PositiveFixedPercentageModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PositiveFixedPercentageModel(value);
  }

  public static Long toDocx4J(ST_PositiveFixedPercentageModel value) {
    return null;
  }
}
