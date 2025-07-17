package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OfPieTypeModel;
import org.docx4j.dml.chart.CTOfPieType;

public class CT_OfPieTypeConverter {
  private CT_OfPieTypeConverter() {
  }

  public static CT_OfPieTypeModel fromDocx4j(CTOfPieType value) {
    if (value == null) return null;
    return new CT_OfPieTypeModel(ST_OfPieTypeConverter.fromDocx4j(value.getVal()));
  }

  public static CTOfPieType toDocx4j(CT_OfPieTypeModel value) {
    return null;
  }
}
