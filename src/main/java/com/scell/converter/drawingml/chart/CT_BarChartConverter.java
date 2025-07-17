package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBarChart;

public class CT_BarChartConverter {
  private CT_BarChartConverter() {
  }

  public static CT_BarChartModel fromDocx4j(CTBarChart value) {
    if (value == null) return null;
    return new CT_BarChartModel(CT_BarDirConverter.fromDocx4j(value.getBarDir()), CT_BarGroupingConverter.fromDocx4j(value.getGrouping()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_BarSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_GapAmountConverter.fromDocx4j(value.getGapWidth()), CT_OverlapConverter.fromDocx4j(value.getOverlap()), value.getSerLines().stream().map(CT_ChartLinesConverter::fromDocx4j).collect(Collectors.toList()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBarChart toDocx4j(CT_BarChartModel value) {
    return null;
  }
}
