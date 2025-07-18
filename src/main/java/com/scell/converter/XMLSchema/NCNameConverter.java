package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NCNameModel;

public class NCNameConverter {
  private NCNameConverter() {
  }

  public static NCNameModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NCNameModel(value);
  }

  public static String toDocx4J(NCNameModel value) {
    return null;
  }
}
