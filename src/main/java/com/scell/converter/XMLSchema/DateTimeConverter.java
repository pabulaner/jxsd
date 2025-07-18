package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DateTimeModel;
import java.time.LocalDateTime;

public class DateTimeConverter {
  private DateTimeConverter() {
  }

  public static DateTimeModel fromDocx4J(LocalDateTime value) {
    if (value == null) return null;
    return new DateTimeModel(value);
  }

  public static LocalDateTime toDocx4J(DateTimeModel value) {
    return null;
  }
}
