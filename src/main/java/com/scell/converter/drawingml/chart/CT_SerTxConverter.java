package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SerTxModel;
import org.docx4j.dml.chart.CTSerTx;

public class CT_SerTxConverter {
  private CT_SerTxConverter() {
  }

  public static CT_SerTxModel fromDocx4j(CTSerTx value) {
    if (value == null) return null;
  }

  public static CTSerTx toDocx4j(CT_SerTxModel value) {
    return null;
  }
}
