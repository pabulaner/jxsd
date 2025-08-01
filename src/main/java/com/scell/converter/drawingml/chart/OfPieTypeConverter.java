package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OfPieTypeModel;
import org.docx4j.dml.chart.CTOfPieType;

public class OfPieTypeConverter {
  private OfPieTypeConverter() {
  }

  public static OfPieTypeModel fromDocx4J(CTOfPieType value) {
    if (value == null) return null;
    return new OfPieTypeModel(OfPieTypeValueConverter.fromDocx4J(value.getVal()));
  }
}
