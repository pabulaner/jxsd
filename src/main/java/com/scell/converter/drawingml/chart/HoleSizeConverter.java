package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.HoleSizeModel;
import org.docx4j.dml.chart.CTHoleSize;

public class HoleSizeConverter {
  private HoleSizeConverter() {
  }

  public static HoleSizeModel fromDocx4J(CTHoleSize value) {
    if (value == null) return null;
    return new HoleSizeModel(HoleSizeConverter.fromDocx4J(value.getVal()));
  }
}
