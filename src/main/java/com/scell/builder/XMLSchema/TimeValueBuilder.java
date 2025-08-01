package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.TimeValueModel;
import java.time.LocalTime;

public class TimeValueBuilder {
  private LocalTime value;

  public TimeValueBuilder() {
  }

  public TimeValueBuilder setValue(LocalTime value) {
    this.value = value;
    return this;
  }

  public TimeValueBuilder from(TimeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TimeValueModel build() {
    return new TimeValueModel(this.value);
  }
}
