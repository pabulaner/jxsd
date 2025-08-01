package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BubbleScaleValueModel;

public class BubbleScaleValueConverter {
  private BubbleScaleValueConverter() {
  }

  public static BubbleScaleValueModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new BubbleScaleValueModel(value);
  }
}
