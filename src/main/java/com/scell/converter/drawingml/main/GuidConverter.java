package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GuidModel;

public class GuidConverter {
  private GuidConverter() {
  }

  public static GuidModel fromDocx4J(String value) {
    if (value == null) return null;
    return new GuidModel(value);
  }
}
