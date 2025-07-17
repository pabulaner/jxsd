package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringConverter;
import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_TrendlineModel;
import org.docx4j.dml.chart.CTTrendline;

public class CT_TrendlineConverter {
  private CT_TrendlineConverter() {
  }

  public static CT_TrendlineModel fromDocx4j(CTTrendline value) {
    if (value == null) return null;
    return new CT_TrendlineModel(StringConverter.fromDocx4j(value.getName()), CT_ShapePropertiesConverter.fromDocx4j(value.getSpPr()), CT_TrendlineTypeConverter.fromDocx4j(value.getTrendlineType()), CT_OrderConverter.fromDocx4j(value.getOrder()), CT_PeriodConverter.fromDocx4j(value.getPeriod()), CT_DoubleConverter.fromDocx4j(value.getForward()), CT_DoubleConverter.fromDocx4j(value.getBackward()), CT_DoubleConverter.fromDocx4j(value.getIntercept()), CT_BooleanConverter.fromDocx4j(value.getDispRSqr()), CT_BooleanConverter.fromDocx4j(value.getDispEq()), CT_TrendlineLblConverter.fromDocx4j(value.getTrendlineLbl()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTrendline toDocx4j(CT_TrendlineModel value) {
    return null;
  }
}
