package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextSpacingPercentValueModel;

public class TextSpacingPercentValueConverter {
  private TextSpacingPercentValueConverter() {
  }

  public static TextSpacingPercentValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new TextSpacingPercentValueModel(value);
  }
}
