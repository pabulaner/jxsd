package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.IDREFValueModel;

public class IDREFValueConverter {
  private IDREFValueConverter() {
  }

  public static IDREFValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new IDREFValueModel(value);
  }
}
