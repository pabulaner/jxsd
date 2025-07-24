package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.XstringModel;

public class XstringBuilder {
  private String value;

  public XstringBuilder() {
  }

  public XstringBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public XstringBuilder from(XstringModel value) {
    this.value = value.getValue();
    return this;
  }

  public XstringModel build() {
    return new XstringModel(this.value);
  }
}
