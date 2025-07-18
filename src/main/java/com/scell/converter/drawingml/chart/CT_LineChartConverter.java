package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LineChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLineChart;

public class CT_LineChartConverter {
  private CT_LineChartConverter() {
  }

  public static CT_LineChartModel fromDocx4J(CTLineChart value) {
    if (value == null) return null;
    return new CT_LineChartModel(CT_GroupingConverter.fromDocx4J(value.getGrouping()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_LineSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_ChartLinesConverter.fromDocx4J(value.getDropLines()), CT_ChartLinesConverter.fromDocx4J(value.getHiLowLines()), CT_UpDownBarsConverter.fromDocx4J(value.getUpDownBars()), CT_BooleanConverter.fromDocx4J(value.getMarker()), CT_BooleanConverter.fromDocx4J(value.getSmooth()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTLineChart toDocx4J(CT_LineChartModel value) {
    return null;
  }
}
