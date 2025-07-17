package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DurationModel;
import java.time.Duration;

public class DurationConverter {
  private DurationConverter() {
  }

  public static DurationModel fromDocx4j(Duration value) {
    if (value == null) return null;
    return new DurationModel(value);
  }

  public static Duration toDocx4j(DurationModel value) {
    return null;
  }
}
