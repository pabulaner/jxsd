package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.QNameModel;

public class QNameConverter {
  private QNameConverter() {
  }

  public static QNameModel fromDocx4j(String value) {
    if (value == null) return null;
    return new QNameModel(value);
  }

  public static String toDocx4j(QNameModel value) {
    return null;
  }
}
