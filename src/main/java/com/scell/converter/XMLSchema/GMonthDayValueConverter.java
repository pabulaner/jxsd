package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GMonthDayValueModel;

public class GMonthDayValueConverter {
  private GMonthDayValueConverter() {
  }

  public static GMonthDayValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GMonthDayValueModel(value);
  }
}
