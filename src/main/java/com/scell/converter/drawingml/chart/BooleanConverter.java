package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BooleanModel;
import org.docx4j.dml.chart.CTBoolean;

public class BooleanConverter {
  private BooleanConverter() {
  }

  public static BooleanModel fromDocx4J(CTBoolean value) {
    if (value == null) return null;
    return new BooleanModel(com.scell.converter.XMLSchema.BooleanConverter.fromDocx4J(value.isVal()));
  }
}
