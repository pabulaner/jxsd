package model.XMLSchema;

import java.time.LocalDate;

public class dateModel {
  private final LocalDate value;

  public dateModel(LocalDate value) {
    this.value = value;
  }

  public LocalDate getValue() {
    return this.value;
  }
}
