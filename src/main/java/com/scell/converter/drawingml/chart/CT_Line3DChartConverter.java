package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Line3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTLine3DChart;

public class CT_Line3DChartConverter {
  private CT_Line3DChartConverter() {
  }

  public static CT_Line3DChartModel fromDocx4J(CTLine3DChart value) {
    if (value == null) return null;
    return new CT_Line3DChartModel(CT_GroupingConverter.fromDocx4J(value.getGrouping()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_LineSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_ChartLinesConverter.fromDocx4J(value.getDropLines()), CT_GapAmountConverter.fromDocx4J(value.getGapDepth()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTLine3DChart toDocx4J(CT_Line3DChartModel value) {
    return null;
  }
}
