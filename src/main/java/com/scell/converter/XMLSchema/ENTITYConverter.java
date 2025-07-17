package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ENTITYModel;

public class ENTITYConverter {
  private ENTITYConverter() {
  }

  public static ENTITYModel fromDocx4j(String value) {
    if (value == null) return null;
    return new ENTITYModel(value);
  }

  public static String toDocx4j(ENTITYModel value) {
    return null;
  }
}
