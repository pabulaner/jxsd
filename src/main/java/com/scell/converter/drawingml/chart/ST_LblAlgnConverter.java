package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LblAlgnModel;
import org.docx4j.dml.chart.STLblAlgn;

public class ST_LblAlgnConverter {
  private ST_LblAlgnConverter() {
  }

  public static ST_LblAlgnModel fromDocx4j(STLblAlgn value) {
    if (value == null) return null;
    if (value == STLblAlgn.CTR) return ST_LblAlgnModel.CTR;
    if (value == STLblAlgn.L) return ST_LblAlgnModel.L;
    if (value == STLblAlgn.R) return ST_LblAlgnModel.R;
    return null;
  }

  public static STLblAlgn toDocx4j(ST_LblAlgnModel value) {
    return null;
  }
}
