package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class UnsignedIntConverter {
  private UnsignedIntConverter() {
  }

  public static UnsignedIntModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new UnsignedIntModel(value);
  }
}
