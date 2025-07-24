package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.StockChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTStockChart;

public class StockChartConverter {
  private StockChartConverter() {
  }

  public static StockChartModel fromDocx4J(CTStockChart value) {
    if (value == null) return null;
    return new StockChartModel(value.getSer().stream().map(LineSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), ChartLinesConverter.fromDocx4J(value.getDropLines()), ChartLinesConverter.fromDocx4J(value.getHiLowLines()), UpDownBarsConverter.fromDocx4J(value.getUpDownBars()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
