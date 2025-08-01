package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SecondPieSizeModel;
import org.docx4j.dml.chart.CTSecondPieSize;

public class SecondPieSizeConverter {
  private SecondPieSizeConverter() {
  }

  public static SecondPieSizeModel fromDocx4J(CTSecondPieSize value) {
    if (value == null) return null;
    return new SecondPieSizeModel(SecondPieSizeValueConverter.fromDocx4J(value.getVal()));
  }
}
