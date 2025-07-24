package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.TimeModel;
import java.time.LocalTime;

public class TimeBuilder {
  private LocalTime value;

  public TimeBuilder() {
  }

  public TimeBuilder setValue(LocalTime value) {
    this.value = value;
    return this;
  }

  public TimeBuilder from(TimeModel value) {
    this.value = value.getValue();
    return this;
  }

  public TimeModel build() {
    return new TimeModel(this.value);
  }
}
