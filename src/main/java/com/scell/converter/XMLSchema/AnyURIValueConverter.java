package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.AnyURIValueModel;

public class AnyURIValueConverter {
  private AnyURIValueConverter() {
  }

  public static AnyURIValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new AnyURIValueModel(value);
  }
}
