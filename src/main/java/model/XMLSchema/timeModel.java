package model.XMLSchema;

import java.time.LocalTime;

public class timeModel {
  private final LocalTime value;

  public timeModel(LocalTime value) {
    this.value = value;
  }

  public LocalTime getValue() {
    return this.value;
  }
}
