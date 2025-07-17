package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDREFModel;

public class IDREFConverter {
  private IDREFConverter() {
  }

  public static IDREFModel fromDocx4j(String value) {
    if (value == null) return null;
    return new IDREFModel(value);
  }

  public static String toDocx4j(IDREFModel value) {
    return null;
  }
}
