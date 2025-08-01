package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.TimeValueModel;
import java.time.LocalTime;

public class TimeValueConverter {
  private TimeValueConverter() {
  }

  public static TimeValueModel fromDocx4J(LocalTime value) {
    if (value == null) return null;
    return new TimeValueModel(value);
  }
}
