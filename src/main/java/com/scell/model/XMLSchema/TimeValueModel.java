package com.scell.model.XMLSchema;

import java.time.LocalTime;

public class TimeValueModel {
  private final LocalTime value;

  public TimeValueModel(LocalTime value) {
    this.value = value;
  }

  public LocalTime getValue() {
    return this.value;
  }
}
