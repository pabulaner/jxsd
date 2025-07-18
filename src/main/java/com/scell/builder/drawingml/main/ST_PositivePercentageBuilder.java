package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_PositivePercentageModel;

public class ST_PositivePercentageBuilder {
  private Long value;

  public ST_PositivePercentageBuilder() {
    this.value = null;
  }

  public ST_PositivePercentageBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PositivePercentageBuilder from(ST_PositivePercentageModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PositivePercentageModel build() {
    return new ST_PositivePercentageModel(this.value);
  }
}
