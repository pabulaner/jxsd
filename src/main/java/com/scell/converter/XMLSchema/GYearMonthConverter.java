package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GYearMonthModel;

public class GYearMonthConverter {
  private GYearMonthConverter() {
  }

  public static GYearMonthModel fromDocx4j(Integer value) {
    if (value == null) return null;
    return new GYearMonthModel(value);
  }

  public static Integer toDocx4j(GYearMonthModel value) {
    return null;
  }
}
