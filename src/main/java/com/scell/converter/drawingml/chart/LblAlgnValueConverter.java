package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LblAlgnValueModel;
import org.docx4j.dml.chart.STLblAlgn;

public class LblAlgnValueConverter {
  private LblAlgnValueConverter() {
  }

  public static LblAlgnValueModel fromDocx4J(STLblAlgn value) {
    if (value == null) return null;
    if (value == STLblAlgn.CTR) return LblAlgnValueModel.CTR;
    if (value == STLblAlgn.L) return LblAlgnValueModel.L;
    if (value == STLblAlgn.R) return LblAlgnValueModel.R;
    return null;
  }
}
