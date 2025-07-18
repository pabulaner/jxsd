package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBarChart;

public class CT_BarChartConverter {
  private CT_BarChartConverter() {
  }

  public static CT_BarChartModel fromDocx4J(CTBarChart value) {
    if (value == null) return null;
    return new CT_BarChartModel(CT_BarDirConverter.fromDocx4J(value.getBarDir()), CT_BarGroupingConverter.fromDocx4J(value.getGrouping()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_BarSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_GapAmountConverter.fromDocx4J(value.getGapWidth()), CT_OverlapConverter.fromDocx4J(value.getOverlap()), value.getSerLines().stream().map(CT_ChartLinesConverter::fromDocx4J).collect(Collectors.toList()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBarChart toDocx4J(CT_BarChartModel value) {
    return null;
  }
}
