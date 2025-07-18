package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import org.docx4j.dml.chart.CTTrendline;

public class CT_TrendlineConverter {
  private CT_TrendlineConverter() {
  }

  public static CT_TrendlineModel fromDocx4J(CTTrendline value) {
    if (value == null) return null;
    return new CT_TrendlineModel(StringConverter.fromDocx4J(value.getName()), CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()), CT_TrendlineTypeConverter.fromDocx4J(value.getTrendlineType()), CT_OrderConverter.fromDocx4J(value.getOrder()), CT_PeriodConverter.fromDocx4J(value.getPeriod()), CT_DoubleConverter.fromDocx4J(value.getForward()), CT_DoubleConverter.fromDocx4J(value.getBackward()), CT_DoubleConverter.fromDocx4J(value.getIntercept()), CT_BooleanConverter.fromDocx4J(value.getDispRSqr()), CT_BooleanConverter.fromDocx4J(value.getDispEq()), CT_TrendlineLblConverter.fromDocx4J(value.getTrendlineLbl()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTTrendline toDocx4J(CT_TrendlineModel value) {
    return null;
  }
}
