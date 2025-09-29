package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.XMLSchema.StringValueConverter;
import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.TrendlineModel;
import org.docx4j.dml.chart.CTTrendline;

/**
 * This is a generated sequence class.
 */
public class TrendlineConverter {
  private TrendlineConverter() {
  }

  public static TrendlineModel fromDocx4j(CTTrendline value) {
    if (value == null) return null;
    return new TrendlineModel(StringValueConverter.fromDocx4j(value.getName()), ShapePropertiesConverter.fromDocx4j(value.getSpPr()), TrendlineTypeConverter.fromDocx4j(value.getTrendlineType()), OrderConverter.fromDocx4j(value.getOrder()), PeriodConverter.fromDocx4j(value.getPeriod()), DoubleConverter.fromDocx4j(value.getForward()), DoubleConverter.fromDocx4j(value.getBackward()), DoubleConverter.fromDocx4j(value.getIntercept()), BooleanConverter.fromDocx4j(value.getDispRSqr()), BooleanConverter.fromDocx4j(value.getDispEq()), TrendlineLblConverter.fromDocx4j(value.getTrendlineLbl()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTTrendline toDocx4j(TrendlineModel value) {
    if (value == null) return null;
    CTTrendline result = new CTTrendline();
    result.setName(StringValueConverter.toDocx4j(value.getName()));
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    result.setTrendlineType(TrendlineTypeConverter.toDocx4j(value.getTrendlineType()));
    result.setOrder(OrderConverter.toDocx4j(value.getOrder()));
    result.setPeriod(PeriodConverter.toDocx4j(value.getPeriod()));
    result.setForward(DoubleConverter.toDocx4j(value.getForward()));
    result.setBackward(DoubleConverter.toDocx4j(value.getBackward()));
    result.setIntercept(DoubleConverter.toDocx4j(value.getIntercept()));
    result.setDispRSqr(BooleanConverter.toDocx4j(value.getDispRSqr()));
    result.setDispEq(BooleanConverter.toDocx4j(value.getDispEq()));
    result.setTrendlineLbl(TrendlineLblConverter.toDocx4j(value.getTrendlineLbl()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
