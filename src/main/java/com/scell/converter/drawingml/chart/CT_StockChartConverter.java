package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StockChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTStockChart;

public class CT_StockChartConverter {
  private CT_StockChartConverter() {
  }

  public static CT_StockChartModel fromDocx4J(CTStockChart value) {
    if (value == null) return null;
    return new CT_StockChartModel(value.getSer().stream().map(CT_LineSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_ChartLinesConverter.fromDocx4J(value.getDropLines()), CT_ChartLinesConverter.fromDocx4J(value.getHiLowLines()), CT_UpDownBarsConverter.fromDocx4J(value.getUpDownBars()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTStockChart toDocx4J(CT_StockChartModel value) {
    return null;
  }
}
