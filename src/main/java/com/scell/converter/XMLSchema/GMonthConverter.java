package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GMonthModel;

public class GMonthConverter {
  private GMonthConverter() {
  }

  public static GMonthModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GMonthModel(value);
  }

  public static Integer toDocx4J(GMonthModel value) {
    return null;
  }
}
