package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TickMarkModel;

public class ST_TickMarkBuilder {
  private ST_TickMarkModel value;

  public ST_TickMarkBuilder() {
    this.value = null;
  }

  public ST_TickMarkBuilder from(ST_TickMarkModel value) {
    this.value = value;
    return this;
  }

  public ST_TickMarkModel build() {
    return this.value;
  }

  public ST_TickMarkBuilder setValue(ST_TickMarkModel value) {
    this.value = value;
    return this;
  }
}
