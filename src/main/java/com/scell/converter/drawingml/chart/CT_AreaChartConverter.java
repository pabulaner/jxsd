package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_AreaChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTAreaChart;

public class CT_AreaChartConverter {
  private CT_AreaChartConverter() {
  }

  public static CT_AreaChartModel fromDocx4j(CTAreaChart value) {
    if (value == null) return null;
    return new CT_AreaChartModel(CT_GroupingConverter.fromDocx4j(value.getGrouping()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_AreaSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_ChartLinesConverter.fromDocx4j(value.getDropLines()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTAreaChart toDocx4j(CT_AreaChartModel value) {
    return null;
  }
}
