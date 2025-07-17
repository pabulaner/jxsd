package model.XMLSchema;

import java.time.Duration;

public class durationModel {
  private final Duration value;

  public durationModel(Duration value) {
    this.value = value;
  }

  public Duration getValue() {
    return this.value;
  }
}
