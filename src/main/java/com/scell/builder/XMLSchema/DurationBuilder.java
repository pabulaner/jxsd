package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DurationModel;
import java.time.Duration;

public class DurationBuilder {
  private Duration value;

  public DurationBuilder() {
  }

  public DurationBuilder setValue(Duration value) {
    this.value = value;
    return this;
  }

  public DurationBuilder from(DurationModel value) {
    this.value = value.getValue();
    return this;
  }

  public DurationModel build() {
    return new DurationModel(this.value);
  }
}
