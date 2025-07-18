package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SizeRepresentsModel;
import org.docx4j.dml.chart.CTSizeRepresents;

public class CT_SizeRepresentsConverter {
  private CT_SizeRepresentsConverter() {
  }

  public static CT_SizeRepresentsModel fromDocx4J(CTSizeRepresents value) {
    if (value == null) return null;
    return new CT_SizeRepresentsModel(ST_SizeRepresentsConverter.fromDocx4J(value.getVal()));
  }

  public static CTSizeRepresents toDocx4J(CT_SizeRepresentsModel value) {
    return null;
  }
}
