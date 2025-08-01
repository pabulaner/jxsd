package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PictureStackUnitValueModel;

public class PictureStackUnitValueBuilder {
  private double value;

  public PictureStackUnitValueBuilder() {
  }

  public PictureStackUnitValueBuilder setValue(double value) {
    this.value = value;
    return this;
  }

  public PictureStackUnitValueBuilder from(PictureStackUnitValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PictureStackUnitValueModel build() {
    return new PictureStackUnitValueModel(this.value);
  }
}
