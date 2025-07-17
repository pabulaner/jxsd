package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_XstringModel;

public class ST_XstringBuilder {
  private String value;

  public ST_XstringBuilder() {
    this.value = null;
  }

  public ST_XstringBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_XstringBuilder from(ST_XstringModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_XstringModel build() {
    return new ST_XstringModel(this.value);
  }
}
