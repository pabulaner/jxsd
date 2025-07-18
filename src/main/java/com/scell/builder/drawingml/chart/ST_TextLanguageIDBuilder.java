package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_TextLanguageIDModel;

public class ST_TextLanguageIDBuilder {
  private String value;

  public ST_TextLanguageIDBuilder() {
    this.value = null;
  }

  public ST_TextLanguageIDBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ST_TextLanguageIDBuilder from(ST_TextLanguageIDModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_TextLanguageIDModel build() {
    return new ST_TextLanguageIDModel(this.value);
  }
}
