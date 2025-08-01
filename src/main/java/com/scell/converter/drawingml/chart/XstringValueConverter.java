package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.XstringValueModel;

public class XstringValueConverter {
  private XstringValueConverter() {
  }

  public static XstringValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new XstringValueModel(value);
  }
}
