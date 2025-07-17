package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StockChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTStockChart;

public class CT_StockChartConverter {
  private CT_StockChartConverter() {
  }

  public static CT_StockChartModel fromDocx4j(CTStockChart value) {
    if (value == null) return null;
    return new CT_StockChartModel(value.getSer().stream().map(CT_LineSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_ChartLinesConverter.fromDocx4j(value.getDropLines()), CT_ChartLinesConverter.fromDocx4j(value.getHiLowLines()), CT_UpDownBarsConverter.fromDocx4j(value.getUpDownBars()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTStockChart toDocx4j(CT_StockChartModel value) {
    return null;
  }
}
