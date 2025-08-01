package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GMonthValueModel;

public class GMonthValueConverter {
  private GMonthValueConverter() {
  }

  public static GMonthValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GMonthValueModel(value);
  }
}
