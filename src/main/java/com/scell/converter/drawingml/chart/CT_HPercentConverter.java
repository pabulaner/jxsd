package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_HPercentModel;
import org.docx4j.dml.chart.CTHPercent;

public class CT_HPercentConverter {
  private CT_HPercentConverter() {
  }

  public static CT_HPercentModel fromDocx4j(CTHPercent value) {
    if (value == null) return null;
    return new CT_HPercentModel(ST_HPercentConverter.fromDocx4j(value.getVal()));
  }

  public static CTHPercent toDocx4j(CT_HPercentModel value) {
    return null;
  }
}
