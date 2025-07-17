package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PeriodModel;

public class ST_PeriodBuilder {
  private Long value;

  public ST_PeriodBuilder() {
    this.value = null;
  }

  public ST_PeriodBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_PeriodBuilder from(ST_PeriodModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PeriodModel build() {
    return new ST_PeriodModel(this.value);
  }
}
