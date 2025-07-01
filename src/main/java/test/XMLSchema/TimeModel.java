package test.XMLSchema;

import java.time.LocalTime;

public class TimeModel {
  private final LocalTime value;

  public TimeModel(LocalTime value) {
    this.value = value;
  }

  public LocalTime getValue() {
    return this.value;
  }
}
