package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.BarChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBarChart;

public class BarChartConverter {
  private BarChartConverter() {
  }

  public static BarChartModel fromDocx4J(CTBarChart value) {
    if (value == null) return null;
    return new BarChartModel(BarDirConverter.fromDocx4J(value.getBarDir()), BarGroupingConverter.fromDocx4J(value.getGrouping()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(BarSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), GapAmountConverter.fromDocx4J(value.getGapWidth()), OverlapConverter.fromDocx4J(value.getOverlap()), value.getSerLines().stream().map(ChartLinesConverter::fromDocx4J).collect(Collectors.toList()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
