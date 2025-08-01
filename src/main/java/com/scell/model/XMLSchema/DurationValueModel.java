package com.scell.model.XMLSchema;

import java.time.Duration;

public class DurationValueModel {
  private final Duration value;

  public DurationValueModel(Duration value) {
    this.value = value;
  }

  public Duration getValue() {
    return this.value;
  }
}
