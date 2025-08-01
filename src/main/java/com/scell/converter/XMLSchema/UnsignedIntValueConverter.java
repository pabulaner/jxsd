package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class UnsignedIntValueConverter {
  private UnsignedIntValueConverter() {
  }

  public static UnsignedIntValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new UnsignedIntValueModel(value);
  }
}
