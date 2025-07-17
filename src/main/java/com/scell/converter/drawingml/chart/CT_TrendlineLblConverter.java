package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.converter.drawingml.main.CT_TextBodyConverter;
import com.scell.model.drawingml.chart.CT_TrendlineLblModel;
import org.docx4j.dml.chart.CTTrendlineLbl;

public class CT_TrendlineLblConverter {
  private CT_TrendlineLblConverter() {
  }

  public static CT_TrendlineLblModel fromDocx4j(CTTrendlineLbl value) {
    if (value == null) return null;
    return new CT_TrendlineLblModel(CT_LayoutConverter.fromDocx4j(value.getLayout()), CT_TxConverter.fromDocx4j(value.getTx()), CT_NumFmtConverter.fromDocx4j(value.getNumFmt()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TextBodyConverter.fromDocx4j(value.getTxPr()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTrendlineLbl toDocx4j(CT_TrendlineLblModel value) {
    return null;
  }
}
