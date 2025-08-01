package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NameValueModel;

public class NameValueConverter {
  private NameValueConverter() {
  }

  public static NameValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NameValueModel(value);
  }
}
