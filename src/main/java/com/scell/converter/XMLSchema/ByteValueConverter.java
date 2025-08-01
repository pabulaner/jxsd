package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ByteValueModel;

public class ByteValueConverter {
  private ByteValueConverter() {
  }

  public static ByteValueModel fromDocx4J(Byte value) {
    if (value == null) return null;
    return new ByteValueModel(value);
  }
}
