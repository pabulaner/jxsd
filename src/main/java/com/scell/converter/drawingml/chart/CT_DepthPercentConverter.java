package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DepthPercentModel;
import org.docx4j.dml.chart.CTDepthPercent;

public class CT_DepthPercentConverter {
  private CT_DepthPercentConverter() {
  }

  public static CT_DepthPercentModel fromDocx4j(CTDepthPercent value) {
    if (value == null) return null;
    return new CT_DepthPercentModel(ST_DepthPercentConverter.fromDocx4j(value.getVal()));
  }

  public static CTDepthPercent toDocx4j(CT_DepthPercentModel value) {
    return null;
  }
}
