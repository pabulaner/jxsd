package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SerTxModel;
import org.docx4j.dml.chart.CTSerTx;

public class CT_SerTxConverter {
  private CT_SerTxConverter() {
  }

  public static CT_SerTxModel fromDocx4J(CTSerTx value) {
    if (value == null) return null;
    if (value.getStrRef() != null) return CT_SerTxModel.newStrRef(CT_StrRefConverter.fromDocx4J(value.getStrRef()));
    if (value.getV() != null) return CT_SerTxModel.newV(ST_XstringConverter.fromDocx4J(value.getV()));
    return new CT_SerTxModel();
  }

  public static CTSerTx toDocx4J(CT_SerTxModel value) {
    return null;
  }
}
