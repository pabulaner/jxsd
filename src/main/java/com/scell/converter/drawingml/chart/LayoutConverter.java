package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutModel;
import org.docx4j.dml.chart.CTLayout;

public class LayoutConverter {
  private LayoutConverter() {
  }

  public static LayoutModel fromDocx4J(CTLayout value) {
    if (value == null) return null;
    return new LayoutModel(ManualLayoutConverter.fromDocx4J(value.getManualLayout()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
