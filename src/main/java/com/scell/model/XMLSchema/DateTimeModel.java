package com.scell.model.XMLSchema;

import java.time.LocalDateTime;

public class DateTimeModel {
  private final LocalDateTime value;

  public DateTimeModel(LocalDateTime value) {
    this.value = value;
  }

  public LocalDateTime getValue() {
    return this.value;
  }
}
