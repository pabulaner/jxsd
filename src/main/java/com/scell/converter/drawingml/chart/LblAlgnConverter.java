package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LblAlgnModel;
import org.docx4j.dml.chart.CTLblAlgn;

public class LblAlgnConverter {
  private LblAlgnConverter() {
  }

  public static LblAlgnModel fromDocx4J(CTLblAlgn value) {
    if (value == null) return null;
    return new LblAlgnModel(LblAlgnValueConverter.fromDocx4J(value.getVal()));
  }
}
