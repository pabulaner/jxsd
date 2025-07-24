package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.ShapePropertiesConverter;
import com.scell.model.drawingml.chart.ChartLinesModel;
import org.docx4j.dml.chart.CTChartLines;

public class ChartLinesConverter {
  private ChartLinesConverter() {
  }

  public static ChartLinesModel fromDocx4J(CTChartLines value) {
    if (value == null) return null;
    return new ChartLinesModel(ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
  }
}
