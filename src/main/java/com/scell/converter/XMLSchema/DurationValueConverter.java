package com.scell.converter.XMLSchema;

import com.scell.model.XMLSchema.DurationValueModel;
import java.time.Duration;

public class DurationValueConverter {
  private DurationValueConverter() {
  }

  public static DurationValueModel fromDocx4J(Duration value) {
    if (value == null) return null;
    return new DurationValueModel(value);
  }
}
