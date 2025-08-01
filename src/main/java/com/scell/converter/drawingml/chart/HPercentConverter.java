package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.HPercentModel;
import org.docx4j.dml.chart.CTHPercent;

public class HPercentConverter {
  private HPercentConverter() {
  }

  public static HPercentModel fromDocx4J(CTHPercent value) {
    if (value == null) return null;
    return new HPercentModel(HPercentValueConverter.fromDocx4J(value.getVal()));
  }
}
