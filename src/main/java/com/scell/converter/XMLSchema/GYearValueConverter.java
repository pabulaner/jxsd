package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GYearValueModel;

public class GYearValueConverter {
  private GYearValueConverter() {
  }

  public static GYearValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GYearValueModel(value);
  }
}
