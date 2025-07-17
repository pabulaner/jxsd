package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OfPieTypeModel;
import org.docx4j.dml.chart.STOfPieType;

public class ST_OfPieTypeConverter {
  private ST_OfPieTypeConverter() {
  }

  public static ST_OfPieTypeModel fromDocx4j(STOfPieType value) {
    if (value == null) return null;
    if (value == STOfPieType.PIE) return ST_OfPieTypeModel.PIE;
    if (value == STOfPieType.BAR) return ST_OfPieTypeModel.BAR;
    return null;
  }

  public static STOfPieType toDocx4j(ST_OfPieTypeModel value) {
    return null;
  }
}
