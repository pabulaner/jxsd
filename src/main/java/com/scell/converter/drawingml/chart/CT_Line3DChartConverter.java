package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Line3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLine3DChart;

public class CT_Line3DChartConverter {
  private CT_Line3DChartConverter() {
  }

  public static CT_Line3DChartModel fromDocx4j(CTLine3DChart value) {
    if (value == null) return null;
    return new CT_Line3DChartModel(CT_GroupingConverter.fromDocx4j(value.getGrouping()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_LineSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_ChartLinesConverter.fromDocx4j(value.getDropLines()), CT_GapAmountConverter.fromDocx4j(value.getGapDepth()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLine3DChart toDocx4j(CT_Line3DChartModel value) {
    return null;
  }
}
