package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BuiltInUnitModel;
import org.docx4j.dml.chart.CTBuiltInUnit;

public class BuiltInUnitConverter {
  private BuiltInUnitConverter() {
  }

  public static BuiltInUnitModel fromDocx4J(CTBuiltInUnit value) {
    if (value == null) return null;
    return new BuiltInUnitModel(BuiltInUnitConverter.fromDocx4J(value.getVal()));
  }
}
