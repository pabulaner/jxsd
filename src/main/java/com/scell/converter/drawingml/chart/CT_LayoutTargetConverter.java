package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LayoutTargetModel;
import org.docx4j.dml.chart.CTLayoutTarget;

public class CT_LayoutTargetConverter {
  private CT_LayoutTargetConverter() {
  }

  public static CT_LayoutTargetModel fromDocx4j(CTLayoutTarget value) {
    if (value == null) return null;
    return new CT_LayoutTargetModel(ST_LayoutTargetConverter.fromDocx4j(value.getVal()));
  }

  public static CTLayoutTarget toDocx4j(CT_LayoutTargetModel value) {
    return null;
  }
}
