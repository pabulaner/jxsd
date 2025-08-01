package com.scell.model.XMLSchema;

import java.time.LocalDateTime;

public class DateTimeValueModel {
  private final LocalDateTime value;

  public DateTimeValueModel(LocalDateTime value) {
    this.value = value;
  }

  public LocalDateTime getValue() {
    return this.value;
  }
}
