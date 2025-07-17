package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PageSetupOrientationModel;

public class ST_PageSetupOrientationBuilder {
  private ST_PageSetupOrientationModel value;

  public ST_PageSetupOrientationBuilder() {
    this.value = null;
  }

  public ST_PageSetupOrientationBuilder from(ST_PageSetupOrientationModel value) {
    this.value = value;
    return this;
  }

  public ST_PageSetupOrientationModel build() {
    return this.value;
  }

  public ST_PageSetupOrientationBuilder setValue(ST_PageSetupOrientationModel value) {
    this.value = value;
    return this;
  }
}
