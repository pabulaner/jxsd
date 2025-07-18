package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PictureStackUnitModel;

public class ST_PictureStackUnitBuilder {
  private Double value;

  public ST_PictureStackUnitBuilder() {
    this.value = null;
  }

  public ST_PictureStackUnitBuilder setValue(Double value) {
    this.value = value;
    return this;
  }

  public ST_PictureStackUnitBuilder from(ST_PictureStackUnitModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_PictureStackUnitModel build() {
    return new ST_PictureStackUnitModel(this.value);
  }
}
