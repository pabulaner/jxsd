package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.converter.drawingml.main.ShapePropertiesConverter;
import jxsd.gen.model.drawingml.chart.ChartLinesModel;
import org.docx4j.dml.chart.CTChartLines;

/**
 * This is a generated sequence class.
 */
public class ChartLinesConverter {
  private ChartLinesConverter() {
  }

  public static ChartLinesModel fromDocx4j(CTChartLines value) {
    if (value == null) return null;
    return new ChartLinesModel(ShapePropertiesConverter.fromDocx4j(value.getSpPr()));
  }

  public static CTChartLines toDocx4j(ChartLinesModel value) {
    if (value == null) return null;
    CTChartLines result = new CTChartLines();
    result.setSpPr(ShapePropertiesConverter.toDocx4j(value.getSpPr()));
    return result;
  }
}
