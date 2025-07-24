package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GDayModel;

public class GDayConverter {
  private GDayConverter() {
  }

  public static GDayModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new GDayModel(value);
  }
}
