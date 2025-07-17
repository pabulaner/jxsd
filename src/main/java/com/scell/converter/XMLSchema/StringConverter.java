package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.StringModel;

public class StringConverter {
  private StringConverter() {
  }

  public static StringModel fromDocx4j(String value) {
    if (value == null) return null;
    return new StringModel(value);
  }

  public static String toDocx4j(StringModel value) {
    return null;
  }
}
