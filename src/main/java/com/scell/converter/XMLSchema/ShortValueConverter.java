package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.ShortValueModel;

public class ShortValueConverter {
  private ShortValueConverter() {
  }

  public static ShortValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new ShortValueModel(value);
  }
}
