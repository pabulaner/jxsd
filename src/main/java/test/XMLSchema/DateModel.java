package test.XMLSchema;

import java.time.LocalDate;

public class DateModel {
  private final LocalDate value;

  public DateModel(LocalDate value) {
    this.value = value;
  }

  public LocalDate getValue() {
    return this.value;
  }
}
