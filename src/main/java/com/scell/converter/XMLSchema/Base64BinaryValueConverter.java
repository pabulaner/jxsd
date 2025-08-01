package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.Base64BinaryValueModel;

public class Base64BinaryValueConverter {
  private Base64BinaryValueConverter() {
  }

  public static Base64BinaryValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new Base64BinaryValueModel(value);
  }
}
