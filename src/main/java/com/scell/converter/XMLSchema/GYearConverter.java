package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.GYearModel;

public class GYearConverter {
  private GYearConverter() {
  }

  public static GYearModel fromDocx4j(Integer value) {
    if (value == null) return null;
    return new GYearModel(value);
  }

  public static Integer toDocx4j(GYearModel value) {
    return null;
  }
}
