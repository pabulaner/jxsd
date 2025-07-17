package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LblAlgnModel;
import org.docx4j.dml.chart.CTLblAlgn;

public class CT_LblAlgnConverter {
  private CT_LblAlgnConverter() {
  }

  public static CT_LblAlgnModel fromDocx4j(CTLblAlgn value) {
    if (value == null) return null;
    return new CT_LblAlgnModel(ST_LblAlgnConverter.fromDocx4j(value.getVal()));
  }

  public static CTLblAlgn toDocx4j(CT_LblAlgnModel value) {
    return null;
  }
}
