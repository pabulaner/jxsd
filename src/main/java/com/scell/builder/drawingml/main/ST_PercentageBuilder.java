package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PercentageModel;

public class ST_PercentageBuilder {
  private Long value;

  public ST_PercentageBuilder() {
    this.value = null;
  }

  public ST_PercentageBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PercentageBuilder from(ST_PercentageModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PercentageModel build() {
    return new ST_PercentageModel(this.value);
  }
}
