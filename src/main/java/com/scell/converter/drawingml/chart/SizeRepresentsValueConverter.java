package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SizeRepresentsValueModel;
import org.docx4j.dml.chart.STSizeRepresents;

public class SizeRepresentsValueConverter {
  private SizeRepresentsValueConverter() {
  }

  public static SizeRepresentsValueModel fromDocx4J(STSizeRepresents value) {
    if (value == null) return null;
    if (value == STSizeRepresents.AREA) return SizeRepresentsValueModel.AREA;
    if (value == STSizeRepresents.W) return SizeRepresentsValueModel.W;
    return null;
  }
}
