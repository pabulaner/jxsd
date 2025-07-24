package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DateTimeModel;
import java.time.LocalDateTime;

public class DateTimeBuilder {
  private LocalDateTime value;

  public DateTimeBuilder() {
  }

  public DateTimeBuilder setValue(LocalDateTime value) {
    this.value = value;
    return this;
  }

  public DateTimeBuilder from(DateTimeModel value) {
    this.value = value.getValue();
    return this;
  }

  public DateTimeModel build() {
    return new DateTimeModel(this.value);
  }
}
