package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PageSetupOrientationValueModel;

public class PageSetupOrientationValueBuilder {
  private PageSetupOrientationValueModel value;

  public PageSetupOrientationValueBuilder() {
    this.value = null;
  }

  public PageSetupOrientationValueBuilder from(PageSetupOrientationValueModel value) {
    this.value = value;
    return this;
  }

  public PageSetupOrientationValueModel build() {
    return this.value;
  }

  public PageSetupOrientationValueBuilder setValue(PageSetupOrientationValueModel value) {
    this.value = value;
    return this;
  }
}
