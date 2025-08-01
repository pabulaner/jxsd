package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.QNameValueModel;

public class QNameValueConverter {
  private QNameValueConverter() {
  }

  public static QNameValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new QNameValueModel(value);
  }
}
