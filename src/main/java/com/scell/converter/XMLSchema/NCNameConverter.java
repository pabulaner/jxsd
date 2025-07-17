package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NCNameModel;

public class NCNameConverter {
  private NCNameConverter() {
  }

  public static NCNameModel fromDocx4j(String value) {
    if (value == null) return null;
    return new NCNameModel(value);
  }

  public static String toDocx4j(NCNameModel value) {
    return null;
  }
}
