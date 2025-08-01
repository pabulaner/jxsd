package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GYearMonthValueModel;

public class GYearMonthValueConverter {
  private GYearMonthValueConverter() {
  }

  public static GYearMonthValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GYearMonthValueModel(value);
  }
}
