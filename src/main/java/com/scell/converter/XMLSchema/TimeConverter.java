package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.TimeModel;
import java.time.LocalTime;

public class TimeConverter {
  private TimeConverter() {
  }

  public static TimeModel fromDocx4j(LocalTime value) {
    if (value == null) return null;
    return new TimeModel(value);
  }

  public static LocalTime toDocx4j(TimeModel value) {
    return null;
  }
}
