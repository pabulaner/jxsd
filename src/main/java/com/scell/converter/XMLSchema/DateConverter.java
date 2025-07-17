package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DateModel;
import java.time.LocalDate;

public class DateConverter {
  private DateConverter() {
  }

  public static DateModel fromDocx4j(LocalDate value) {
    if (value == null) return null;
    return new DateModel(value);
  }

  public static LocalDate toDocx4j(DateModel value) {
    return null;
  }
}
