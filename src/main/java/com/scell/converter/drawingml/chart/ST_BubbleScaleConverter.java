package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_BubbleScaleModel;

public class ST_BubbleScaleConverter {
  private ST_BubbleScaleConverter() {
  }

  public static ST_BubbleScaleModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_BubbleScaleModel(value);
  }

  public static Long toDocx4j(ST_BubbleScaleModel value) {
    return null;
  }
}
