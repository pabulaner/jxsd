package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DateTimeModel;
import java.time.LocalDateTime;

public class DateTimeConverter {
  private DateTimeConverter() {
  }

  public static DateTimeModel fromDocx4j(LocalDateTime value) {
    if (value == null) return null;
    return new DateTimeModel(value);
  }

  public static LocalDateTime toDocx4j(DateTimeModel value) {
    return null;
  }
}
