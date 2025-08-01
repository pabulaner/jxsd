package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.XstringValueModel;

public class XstringValueBuilder {
  private String value;

  public XstringValueBuilder() {
  }

  public XstringValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public XstringValueBuilder from(XstringValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public XstringValueModel build() {
    return new XstringValueModel(this.value);
  }
}
