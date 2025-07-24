package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.converter.drawingml.main.TextBodyConverter;
import com.scell.model.drawingml.chart.TrendlineLblModel;
import org.docx4j.dml.chart.CTTrendlineLbl;

public class TrendlineLblConverter {
  private TrendlineLblConverter() {
  }

  public static TrendlineLblModel fromDocx4J(CTTrendlineLbl value) {
    if (value == null) return null;
    return new TrendlineLblModel(LayoutConverter.fromDocx4J(value.getLayout()), TxConverter.fromDocx4J(value.getTx()), NumFmtConverter.fromDocx4J(value.getNumFmt()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TextBodyConverter.fromDocx4J(value.getTxPr()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
