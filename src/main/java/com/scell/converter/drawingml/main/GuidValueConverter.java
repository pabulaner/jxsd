package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GuidValueModel;

public class GuidValueConverter {
  private GuidValueConverter() {
  }

  public static GuidValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new GuidValueModel(value);
  }
}
