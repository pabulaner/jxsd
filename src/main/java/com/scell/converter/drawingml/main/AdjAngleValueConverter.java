package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.AdjAngleValueModel;
import java.lang.String;

public class AdjAngleValueConverter {
  private AdjAngleValueConverter() {
  }

  public static AdjAngleValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new AdjAngleValueModel(value);
  }
}
