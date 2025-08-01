package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutTargetValueModel;
import org.docx4j.dml.chart.STLayoutTarget;

public class LayoutTargetValueConverter {
  private LayoutTargetValueConverter() {
  }

  public static LayoutTargetValueModel fromDocx4J(STLayoutTarget value) {
    if (value == null) return null;
    if (value == STLayoutTarget.INNER) return LayoutTargetValueModel.INNER;
    if (value == STLayoutTarget.OUTER) return LayoutTargetValueModel.OUTER;
    return null;
  }
}
