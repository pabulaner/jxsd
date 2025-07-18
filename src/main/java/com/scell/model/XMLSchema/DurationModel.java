package com.scell.model.XMLSchema;

import java.time.Duration;

public class DurationModel {
  private final Duration value;

  public DurationModel(Duration value) {
    this.value = value;
  }

  public Duration getValue() {
    return this.value;
  }
}
