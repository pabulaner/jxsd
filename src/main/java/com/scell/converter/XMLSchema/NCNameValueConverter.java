package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.NCNameValueModel;

public class NCNameValueConverter {
  private NCNameValueConverter() {
  }

  public static NCNameValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new NCNameValueModel(value);
  }
}
