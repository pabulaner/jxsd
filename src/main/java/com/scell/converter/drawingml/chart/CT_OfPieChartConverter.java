package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OfPieChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTOfPieChart;

public class CT_OfPieChartConverter {
  private CT_OfPieChartConverter() {
  }

  public static CT_OfPieChartModel fromDocx4j(CTOfPieChart value) {
    if (value == null) return null;
    return new CT_OfPieChartModel(CT_OfPieTypeConverter.fromDocx4j(value.getOfPieType()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_GapAmountConverter.fromDocx4j(value.getGapWidth()), CT_SplitTypeConverter.fromDocx4j(value.getSplitType()), CT_DoubleConverter.fromDocx4j(value.getSplitPos()), CT_CustSplitConverter.fromDocx4j(value.getCustSplit()), CT_SecondPieSizeConverter.fromDocx4j(value.getSecondPieSize()), value.getSerLines().stream().map(CT_ChartLinesConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTOfPieChart toDocx4j(CT_OfPieChartModel value) {
    return null;
  }
}
