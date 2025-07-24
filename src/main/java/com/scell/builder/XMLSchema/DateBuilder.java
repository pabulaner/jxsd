package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DateModel;
import java.time.LocalDate;

public class DateBuilder {
  private LocalDate value;

  public DateBuilder() {
  }

  public DateBuilder setValue(LocalDate value) {
    this.value = value;
    return this;
  }

  public DateBuilder from(DateModel value) {
    this.value = value.getValue();
    return this;
  }

  public DateModel build() {
    return new DateModel(this.value);
  }
}
