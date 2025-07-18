package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;

public class ST_PositiveFixedPercentageBuilder {
  private Long value;

  public ST_PositiveFixedPercentageBuilder() {
    this.value = null;
  }

  public ST_PositiveFixedPercentageBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PositiveFixedPercentageBuilder from(ST_PositiveFixedPercentageModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PositiveFixedPercentageModel build() {
    return new ST_PositiveFixedPercentageModel(this.value);
  }
}
