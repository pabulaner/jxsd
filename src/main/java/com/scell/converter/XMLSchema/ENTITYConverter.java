package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ENTITYModel;

public class ENTITYConverter {
  private ENTITYConverter() {
  }

  public static ENTITYModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ENTITYModel(value);
  }
}
