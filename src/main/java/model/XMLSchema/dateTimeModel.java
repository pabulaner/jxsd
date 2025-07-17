package model.XMLSchema;

import java.time.LocalDateTime;

public class dateTimeModel {
  private final LocalDateTime value;

  public dateTimeModel(LocalDateTime value) {
    this.value = value;
  }

  public LocalDateTime getValue() {
    return this.value;
  }
}
