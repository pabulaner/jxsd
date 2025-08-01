package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DateTimeValueModel;
import java.time.LocalDateTime;

public class DateTimeValueConverter {
  private DateTimeValueConverter() {
  }

  public static DateTimeValueModel fromDocx4J(LocalDateTime value) {
    if (value == null) return null;
    return new DateTimeValueModel(value);
  }
}
