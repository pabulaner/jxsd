package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OfPieChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTOfPieChart;

public class CT_OfPieChartConverter {
  private CT_OfPieChartConverter() {
  }

  public static CT_OfPieChartModel fromDocx4J(CTOfPieChart value) {
    if (value == null) return null;
    return new CT_OfPieChartModel(CT_OfPieTypeConverter.fromDocx4J(value.getOfPieType()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_GapAmountConverter.fromDocx4J(value.getGapWidth()), CT_SplitTypeConverter.fromDocx4J(value.getSplitType()), CT_DoubleConverter.fromDocx4J(value.getSplitPos()), CT_CustSplitConverter.fromDocx4J(value.getCustSplit()), CT_SecondPieSizeConverter.fromDocx4J(value.getSecondPieSize()), value.getSerLines().stream().map(CT_ChartLinesConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTOfPieChart toDocx4J(CT_OfPieChartModel value) {
    return null;
  }
}
