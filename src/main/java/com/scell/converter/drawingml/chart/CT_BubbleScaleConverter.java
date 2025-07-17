package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BubbleScaleModel;
import org.docx4j.dml.chart.CTBubbleScale;

public class CT_BubbleScaleConverter {
  private CT_BubbleScaleConverter() {
  }

  public static CT_BubbleScaleModel fromDocx4j(CTBubbleScale value) {
    if (value == null) return null;
    return new CT_BubbleScaleModel(ST_BubbleScaleConverter.fromDocx4j(value.getVal()));
  }

  public static CTBubbleScale toDocx4j(CT_BubbleScaleModel value) {
    return null;
  }
}
