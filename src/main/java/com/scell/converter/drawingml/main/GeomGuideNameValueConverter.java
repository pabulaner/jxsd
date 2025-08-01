package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideNameValueModel;

public class GeomGuideNameValueConverter {
  private GeomGuideNameValueConverter() {
  }

  public static GeomGuideNameValueModel fromDocx4J(String value) {
    if (value == null) return null;
    return new GeomGuideNameValueModel(value);
  }
}
