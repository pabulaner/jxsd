package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GDayValueModel;

public class GDayValueConverter {
  private GDayValueConverter() {
  }

  public static GDayValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GDayValueModel(value);
  }
}
