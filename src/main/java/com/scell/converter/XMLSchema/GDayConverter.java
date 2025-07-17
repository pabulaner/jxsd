package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GDayModel;

public class GDayConverter {
  private GDayConverter() {
  }

  public static GDayModel fromDocx4j(Integer value) {
    if (value == null) return null;
    return new GDayModel(value);
  }

  public static Integer toDocx4j(GDayModel value) {
    return null;
  }
}
