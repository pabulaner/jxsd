package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PictureStackUnitValueModel;

public class PictureStackUnitValueConverter {
  private PictureStackUnitValueConverter() {
  }

  public static PictureStackUnitValueModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new PictureStackUnitValueModel(value);
  }
}
