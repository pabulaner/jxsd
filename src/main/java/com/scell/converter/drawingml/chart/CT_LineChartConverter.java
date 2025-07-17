package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LineChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLineChart;

public class CT_LineChartConverter {
  private CT_LineChartConverter() {
  }

  public static CT_LineChartModel fromDocx4j(CTLineChart value) {
    if (value == null) return null;
    return new CT_LineChartModel(CT_GroupingConverter.fromDocx4j(value.getGrouping()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_LineSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_ChartLinesConverter.fromDocx4j(value.getDropLines()), CT_ChartLinesConverter.fromDocx4j(value.getHiLowLines()), CT_UpDownBarsConverter.fromDocx4j(value.getUpDownBars()), CT_BooleanConverter.fromDocx4j(value.getMarker()), CT_BooleanConverter.fromDocx4j(value.getSmooth()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLineChart toDocx4j(CT_LineChartModel value) {
    return null;
  }
}
