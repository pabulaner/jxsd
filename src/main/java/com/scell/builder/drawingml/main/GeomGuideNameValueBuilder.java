package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GeomGuideNameValueModel;

public class GeomGuideNameValueBuilder {
  private String value;

  public GeomGuideNameValueBuilder() {
  }

  public GeomGuideNameValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public GeomGuideNameValueBuilder from(GeomGuideNameValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GeomGuideNameValueModel build() {
    return new GeomGuideNameValueModel(this.value);
  }
}
