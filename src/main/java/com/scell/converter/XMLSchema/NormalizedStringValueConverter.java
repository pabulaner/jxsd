package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NormalizedStringValueModel;

public class NormalizedStringValueConverter {
  private NormalizedStringValueConverter() {
  }

  public static NormalizedStringValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NormalizedStringValueModel(value);
  }
}
