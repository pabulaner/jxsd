package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_ProtectionModel;
import org.docx4j.dml.chart.CTProtection;

public class CT_ProtectionConverter {
  private CT_ProtectionConverter() {
  }

  public static CT_ProtectionModel fromDocx4J(CTProtection value) {
    if (value == null) return null;
    return new CT_ProtectionModel(CT_BooleanConverter.fromDocx4J(value.getChartObject()), CT_BooleanConverter.fromDocx4J(value.getData()), CT_BooleanConverter.fromDocx4J(value.getFormatting()), CT_BooleanConverter.fromDocx4J(value.getSelection()), CT_BooleanConverter.fromDocx4J(value.getUserInterface()));
  }

  public static CTProtection toDocx4J(CT_ProtectionModel value) {
    return null;
  }
}
