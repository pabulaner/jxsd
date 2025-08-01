package com.scell.model.XMLSchema;

import java.time.LocalDate;

public class DateValueModel {
  private final LocalDate value;

  public DateValueModel(LocalDate value) {
    this.value = value;
  }

  public LocalDate getValue() {
    return this.value;
  }
}
