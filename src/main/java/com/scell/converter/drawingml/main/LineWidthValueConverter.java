package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineWidthValueModel;

public class LineWidthValueConverter {
  private LineWidthValueConverter() {
  }

  public static LineWidthValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new LineWidthValueModel(value);
  }
}
