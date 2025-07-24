package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PageSetupOrientationModel;

public class PageSetupOrientationBuilder {
  private PageSetupOrientationModel value;

  public PageSetupOrientationBuilder() {
    this.value = null;
  }

  public PageSetupOrientationBuilder from(PageSetupOrientationModel value) {
    this.value = value;
    return this;
  }

  public PageSetupOrientationModel build() {
    return this.value;
  }

  public PageSetupOrientationBuilder setValue(PageSetupOrientationModel value) {
    this.value = value;
    return this;
  }
}
