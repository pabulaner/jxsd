package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DateValueModel;
import java.time.LocalDate;

public class DateValueConverter {
  private DateValueConverter() {
  }

  public static DateValueModel fromDocx4J(LocalDate value) {
    if (value == null) return null;
    return new DateValueModel(value);
  }
}
