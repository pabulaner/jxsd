package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LayoutModel;
import org.docx4j.dml.chart.CTLayout;

public class CT_LayoutConverter {
  private CT_LayoutConverter() {
  }

  public static CT_LayoutModel fromDocx4j(CTLayout value) {
    if (value == null) return null;
    return new CT_LayoutModel(CT_ManualLayoutConverter.fromDocx4j(value.getManualLayout()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLayout toDocx4j(CT_LayoutModel value) {
    return null;
  }
}
