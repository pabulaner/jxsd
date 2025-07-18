package com.scell.converter.drawingml.chart;

import com.scell.converter.drawingml.main.CT_ShapePropertiesConverter;
import com.scell.model.drawingml.chart.CT_ChartLinesModel;
import org.docx4j.dml.chart.CTChartLines;

public class CT_ChartLinesConverter {
  private CT_ChartLinesConverter() {
  }

  public static CT_ChartLinesModel fromDocx4J(CTChartLines value) {
    if (value == null) return null;
    return new CT_ChartLinesModel(CT_ShapePropertiesConverter.fromDocx4J(value.getSpPr()));
  }

  public static CTChartLines toDocx4J(CT_ChartLinesModel value) {
    return null;
  }
}
