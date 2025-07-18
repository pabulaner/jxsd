package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_TxModel;
import org.docx4j.dml.chart.CTTx;

public class CT_TxConverter {
  private CT_TxConverter() {
  }

  public static CT_TxModel fromDocx4J(CTTx value) {
    if (value == null) return null;
    if (value.getStrRef() != null) return CT_TxModel.newStrRef(CT_StrRefConverter.fromDocx4J(value.getStrRef()));
    if (value.getRich() != null) return CT_TxModel.newRich(CT_TextBodyConverter.fromDocx4J(value.getRich()));
    return new CT_TxModel();
  }

  public static CTTx toDocx4J(CT_TxModel value) {
    return null;
  }
}
