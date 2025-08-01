package com.scell.converter.drawingml.chart;

import com.scell.converter.XMLSchema.StringValueConverter;
import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.TrendlineModel;
import org.docx4j.dml.chart.CTTrendline;

public class TrendlineConverter {
  private TrendlineConverter() {
  }

  public static TrendlineModel fromDocx4J(CTTrendline value) {
    if (value == null) return null;
    return new TrendlineModel(StringValueConverter.fromDocx4J(value.getName()), ShapePropertiesConverter.fromDocx4J(value.getSpPr()), TrendlineTypeConverter.fromDocx4J(value.getTrendlineType()), OrderConverter.fromDocx4J(value.getOrder()), PeriodConverter.fromDocx4J(value.getPeriod()), DoubleConverter.fromDocx4J(value.getForward()), DoubleConverter.fromDocx4J(value.getBackward()), DoubleConverter.fromDocx4J(value.getIntercept()), BooleanConverter.fromDocx4J(value.getDispRSqr()), BooleanConverter.fromDocx4J(value.getDispEq()), TrendlineLblConverter.fromDocx4J(value.getTrendlineLbl()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
