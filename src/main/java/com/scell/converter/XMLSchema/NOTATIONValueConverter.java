package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NOTATIONValueModel;

public class NOTATIONValueConverter {
  private NOTATIONValueConverter() {
  }

  public static NOTATIONValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NOTATIONValueModel(value);
  }
}
