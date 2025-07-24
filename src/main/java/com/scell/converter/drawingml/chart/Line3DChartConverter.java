package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.Line3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLine3DChart;

public class Line3DChartConverter {
  private Line3DChartConverter() {
  }

  public static Line3DChartModel fromDocx4J(CTLine3DChart value) {
    if (value == null) return null;
    return new Line3DChartModel(GroupingConverter.fromDocx4J(value.getGrouping()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(LineSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), ChartLinesConverter.fromDocx4J(value.getDropLines()), GapAmountConverter.fromDocx4J(value.getGapDepth()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
