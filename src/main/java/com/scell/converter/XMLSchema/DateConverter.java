package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DateModel;
import java.time.LocalDate;

public class DateConverter {
  private DateConverter() {
  }

  public static DateModel fromDocx4J(LocalDate value) {
    if (value == null) return null;
    return new DateModel(value);
  }
}
