package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NOTATIONModel;

public class NOTATIONConverter {
  private NOTATIONConverter() {
  }

  public static NOTATIONModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NOTATIONModel(value);
  }

  public static String toDocx4J(NOTATIONModel value) {
    return null;
  }
}
