package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.AreaChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTAreaChart;

public class AreaChartConverter {
  private AreaChartConverter() {
  }

  public static AreaChartModel fromDocx4J(CTAreaChart value) {
    if (value == null) return null;
    return new AreaChartModel(GroupingConverter.fromDocx4J(value.getGrouping()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(AreaSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), ChartLinesConverter.fromDocx4J(value.getDropLines()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
