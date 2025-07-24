package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ProtectionModel;
import org.docx4j.dml.chart.CTProtection;

public class ProtectionConverter {
  private ProtectionConverter() {
  }

  public static ProtectionModel fromDocx4J(CTProtection value) {
    if (value == null) return null;
    return new ProtectionModel(BooleanConverter.fromDocx4J(value.getChartObject()), BooleanConverter.fromDocx4J(value.getData()), BooleanConverter.fromDocx4J(value.getFormatting()), BooleanConverter.fromDocx4J(value.getSelection()), BooleanConverter.fromDocx4J(value.getUserInterface()));
  }
}
