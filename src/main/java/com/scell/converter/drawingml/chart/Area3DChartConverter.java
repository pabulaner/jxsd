package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.Area3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTArea3DChart;

public class Area3DChartConverter {
  private Area3DChartConverter() {
  }

  public static Area3DChartModel fromDocx4J(CTArea3DChart value) {
    if (value == null) return null;
    return new Area3DChartModel(GroupingConverter.fromDocx4J(value.getGrouping()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(AreaSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), ChartLinesConverter.fromDocx4J(value.getDropLines()), GapAmountConverter.fromDocx4J(value.getGapDepth()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
