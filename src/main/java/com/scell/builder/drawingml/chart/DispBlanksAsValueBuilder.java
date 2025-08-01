package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DispBlanksAsValueModel;

public class DispBlanksAsValueBuilder {
  private DispBlanksAsValueModel value;

  public DispBlanksAsValueBuilder() {
    this.value = null;
  }

  public DispBlanksAsValueBuilder from(DispBlanksAsValueModel value) {
    this.value = value;
    return this;
  }

  public DispBlanksAsValueModel build() {
    return this.value;
  }

  public DispBlanksAsValueBuilder setValue(DispBlanksAsValueModel value) {
    this.value = value;
    return this;
  }
}
