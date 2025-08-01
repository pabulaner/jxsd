package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DateTimeValueModel;
import java.time.LocalDateTime;

public class DateTimeValueBuilder {
  private LocalDateTime value;

  public DateTimeValueBuilder() {
  }

  public DateTimeValueBuilder setValue(LocalDateTime value) {
    this.value = value;
    return this;
  }

  public DateTimeValueBuilder from(DateTimeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DateTimeValueModel build() {
    return new DateTimeValueModel(this.value);
  }
}
