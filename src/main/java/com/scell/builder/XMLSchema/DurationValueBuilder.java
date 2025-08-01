package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DurationValueModel;
import java.time.Duration;

public class DurationValueBuilder {
  private Duration value;

  public DurationValueBuilder() {
  }

  public DurationValueBuilder setValue(Duration value) {
    this.value = value;
    return this;
  }

  public DurationValueBuilder from(DurationValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DurationValueModel build() {
    return new DurationValueModel(this.value);
  }
}
