package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AreaChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTAreaChart;

public class CT_AreaChartConverter {
  private CT_AreaChartConverter() {
  }

  public static CT_AreaChartModel fromDocx4J(CTAreaChart value) {
    if (value == null) return null;
    return new CT_AreaChartModel(CT_GroupingConverter.fromDocx4J(value.getGrouping()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_AreaSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_ChartLinesConverter.fromDocx4J(value.getDropLines()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTAreaChart toDocx4J(CT_AreaChartModel value) {
    return null;
  }
}
