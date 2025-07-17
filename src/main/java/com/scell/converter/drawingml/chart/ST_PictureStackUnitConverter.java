package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PictureStackUnitModel;

public class ST_PictureStackUnitConverter {
  private ST_PictureStackUnitConverter() {
  }

  public static ST_PictureStackUnitModel fromDocx4j(Double value) {
    if (value == null) return null;
    return new ST_PictureStackUnitModel(value);
  }

  public static Double toDocx4j(ST_PictureStackUnitModel value) {
    return null;
  }
}
