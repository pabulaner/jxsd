package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.BooleanModel;

public class BooleanConverter {
  private BooleanConverter() {
  }

  public static BooleanModel fromDocx4j(Boolean value) {
    if (value == null) return null;
    return new BooleanModel(value);
  }

  public static Boolean toDocx4j(BooleanModel value) {
    return null;
  }
}
