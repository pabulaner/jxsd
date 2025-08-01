package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPointValueModel;

public class TextSpacingPointValueConverter {
  private TextSpacingPointValueConverter() {
  }

  public static TextSpacingPointValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextSpacingPointValueModel(value);
  }
}
