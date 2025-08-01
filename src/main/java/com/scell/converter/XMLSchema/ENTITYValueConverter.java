package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ENTITYValueModel;

public class ENTITYValueConverter {
  private ENTITYValueConverter() {
  }

  public static ENTITYValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new ENTITYValueModel(value);
  }
}
