package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BuiltInUnitModel;
import org.docx4j.dml.chart.CTBuiltInUnit;

public class CT_BuiltInUnitConverter {
  private CT_BuiltInUnitConverter() {
  }

  public static CT_BuiltInUnitModel fromDocx4j(CTBuiltInUnit value) {
    if (value == null) return null;
    return new CT_BuiltInUnitModel(ST_BuiltInUnitConverter.fromDocx4j(value.getVal()));
  }

  public static CTBuiltInUnit toDocx4j(CT_BuiltInUnitModel value) {
    return null;
  }
}
