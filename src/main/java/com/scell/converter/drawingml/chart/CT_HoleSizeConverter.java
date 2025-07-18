package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_HoleSizeModel;
import org.docx4j.dml.chart.CTHoleSize;

public class CT_HoleSizeConverter {
  private CT_HoleSizeConverter() {
  }

  public static CT_HoleSizeModel fromDocx4J(CTHoleSize value) {
    if (value == null) return null;
    return new CT_HoleSizeModel(ST_HoleSizeConverter.fromDocx4J(value.getVal()));
  }

  public static CTHoleSize toDocx4J(CT_HoleSizeModel value) {
    return null;
  }
}
