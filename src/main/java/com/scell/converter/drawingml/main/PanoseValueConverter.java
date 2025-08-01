package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.PanoseValueModel;

public class PanoseValueConverter {
  private PanoseValueConverter() {
  }

  public static PanoseValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new PanoseValueModel(value);
  }
}
