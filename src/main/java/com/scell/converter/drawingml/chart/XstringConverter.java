package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.XstringModel;

public class XstringConverter {
  private XstringConverter() {
  }

  public static XstringModel fromDocx4J(String value) {
    if (value == null) return null;
    return new XstringModel(value);
  }
}
