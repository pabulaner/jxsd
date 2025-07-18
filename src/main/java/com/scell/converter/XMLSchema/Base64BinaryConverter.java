package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.Base64BinaryModel;

public class Base64BinaryConverter {
  private Base64BinaryConverter() {
  }

  public static Base64BinaryModel fromDocx4J(byte[] value) {
    if (value == null) return null;
    return new Base64BinaryModel(value);
  }

  public static byte[] toDocx4J(Base64BinaryModel value) {
    return null;
  }
}
