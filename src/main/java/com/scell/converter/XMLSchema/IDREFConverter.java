package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDREFModel;

public class IDREFConverter {
  private IDREFConverter() {
  }

  public static IDREFModel fromDocx4J(String value) {
    if (value == null) return null;
    return new IDREFModel(value);
  }
}
