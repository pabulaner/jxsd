package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.TxModel;
import org.docx4j.dml.chart.CTTx;

public class TxConverter {
  private TxConverter() {
  }

  public static TxModel fromDocx4J(CTTx value) {
    if (value == null) return null;
    if (value.getStrRef() != null) return TxModel.newStrRef(StrRefConverter.fromDocx4J(value.getStrRef()));
    if (value.getRich() != null) return TxModel.newRich(TextBodyConverter.fromDocx4J(value.getRich()));
    return new TxModel();
  }
}
