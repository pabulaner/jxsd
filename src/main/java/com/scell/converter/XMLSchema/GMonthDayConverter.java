package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GMonthDayModel;

public class GMonthDayConverter {
  private GMonthDayConverter() {
  }

  public static GMonthDayModel fromDocx4j(Integer value) {
    if (value == null) return null;
    return new GMonthDayModel(value);
  }

  public static Integer toDocx4j(GMonthDayModel value) {
    return null;
  }
}
