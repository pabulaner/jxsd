package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_FixedPercentageModel;

public class ST_FixedPercentageBuilder {
  private Long value;

  public ST_FixedPercentageBuilder() {
    this.value = null;
  }

  public ST_FixedPercentageBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_FixedPercentageBuilder from(ST_FixedPercentageModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_FixedPercentageModel build() {
    return new ST_FixedPercentageModel(this.value);
  }
}
