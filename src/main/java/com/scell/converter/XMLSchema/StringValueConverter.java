package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.StringValueModel;

public class StringValueConverter {
  private StringValueConverter() {
  }

  public static StringValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new StringValueModel(value);
  }
}
