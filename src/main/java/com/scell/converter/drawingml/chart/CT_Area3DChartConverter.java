package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Area3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTArea3DChart;

public class CT_Area3DChartConverter {
  private CT_Area3DChartConverter() {
  }

  public static CT_Area3DChartModel fromDocx4j(CTArea3DChart value) {
    if (value == null) return null;
    return new CT_Area3DChartModel(CT_GroupingConverter.fromDocx4j(value.getGrouping()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_AreaSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_ChartLinesConverter.fromDocx4j(value.getDropLines()), CT_GapAmountConverter.fromDocx4j(value.getGapDepth()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTArea3DChart toDocx4j(CT_Area3DChartModel value) {
    return null;
  }
}
