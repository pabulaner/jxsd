package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_HPercentModel;
import org.docx4j.dml.chart.CTHPercent;

public class CT_HPercentConverter {
  private CT_HPercentConverter() {
  }

  public static CT_HPercentModel fromDocx4J(CTHPercent value) {
    if (value == null) return null;
    return new CT_HPercentModel(ST_HPercentConverter.fromDocx4J(value.getVal()));
  }

  public static CTHPercent toDocx4J(CT_HPercentModel value) {
    return null;
  }
}
