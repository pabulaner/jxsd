package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LineChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLineChart;

public class LineChartConverter {
  private LineChartConverter() {
  }

  public static LineChartModel fromDocx4J(CTLineChart value) {
    if (value == null) return null;
    return new LineChartModel(GroupingConverter.fromDocx4J(value.getGrouping()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(LineSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), ChartLinesConverter.fromDocx4J(value.getDropLines()), ChartLinesConverter.fromDocx4J(value.getHiLowLines()), UpDownBarsConverter.fromDocx4J(value.getUpDownBars()), BooleanConverter.fromDocx4J(value.getMarker()), BooleanConverter.fromDocx4J(value.getSmooth()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
