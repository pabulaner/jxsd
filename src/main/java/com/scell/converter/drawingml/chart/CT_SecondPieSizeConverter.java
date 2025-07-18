package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SecondPieSizeModel;
import org.docx4j.dml.chart.CTSecondPieSize;

public class CT_SecondPieSizeConverter {
  private CT_SecondPieSizeConverter() {
  }

  public static CT_SecondPieSizeModel fromDocx4J(CTSecondPieSize value) {
    if (value == null) return null;
    return new CT_SecondPieSizeModel(ST_SecondPieSizeConverter.fromDocx4J(value.getVal()));
  }

  public static CTSecondPieSize toDocx4J(CT_SecondPieSizeModel value) {
    return null;
  }
}
