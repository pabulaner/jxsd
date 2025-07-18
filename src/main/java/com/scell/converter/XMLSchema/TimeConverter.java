package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.TimeModel;
import java.time.LocalTime;

public class TimeConverter {
  private TimeConverter() {
  }

  public static TimeModel fromDocx4J(LocalTime value) {
    if (value == null) return null;
    return new TimeModel(value);
  }

  public static LocalTime toDocx4J(TimeModel value) {
    return null;
  }
}
