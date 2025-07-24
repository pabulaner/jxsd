package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GYearMonthModel;

public class GYearMonthConverter {
  private GYearMonthConverter() {
  }

  public static GYearMonthModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GYearMonthModel(value);
  }
}
