package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SerTxModel;
import org.docx4j.dml.chart.CTSerTx;

public class SerTxConverter {
  private SerTxConverter() {
  }

  public static SerTxModel fromDocx4J(CTSerTx value) {
    if (value == null) return null;
    if (value.getStrRef() != null) return SerTxModel.newStrRef(StrRefConverter.fromDocx4J(value.getStrRef()));
    if (value.getV() != null) return SerTxModel.newV(XstringConverter.fromDocx4J(value.getV()));
    return new SerTxModel();
  }
}
