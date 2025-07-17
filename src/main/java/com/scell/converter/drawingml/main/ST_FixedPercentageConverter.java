package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_FixedPercentageModel;

public class ST_FixedPercentageConverter {
  private ST_FixedPercentageConverter() {
  }

  public static ST_FixedPercentageModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_FixedPercentageModel(value);
  }

  public static Long toDocx4j(ST_FixedPercentageModel value) {
    return null;
  }
}
