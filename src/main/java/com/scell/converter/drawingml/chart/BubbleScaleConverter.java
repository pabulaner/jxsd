package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BubbleScaleModel;
import org.docx4j.dml.chart.CTBubbleScale;

public class BubbleScaleConverter {
  private BubbleScaleConverter() {
  }

  public static BubbleScaleModel fromDocx4J(CTBubbleScale value) {
    if (value == null) return null;
    return new BubbleScaleModel(BubbleScaleValueConverter.fromDocx4J(value.getVal()));
  }
}
