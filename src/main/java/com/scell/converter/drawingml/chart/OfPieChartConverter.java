package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OfPieChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTOfPieChart;

public class OfPieChartConverter {
  private OfPieChartConverter() {
  }

  public static OfPieChartModel fromDocx4J(CTOfPieChart value) {
    if (value == null) return null;
    return new OfPieChartModel(OfPieTypeConverter.fromDocx4J(value.getOfPieType()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), GapAmountConverter.fromDocx4J(value.getGapWidth()), SplitTypeConverter.fromDocx4J(value.getSplitType()), DoubleConverter.fromDocx4J(value.getSplitPos()), CustSplitConverter.fromDocx4J(value.getCustSplit()), SecondPieSizeConverter.fromDocx4J(value.getSecondPieSize()), value.getSerLines().stream().map(ChartLinesConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
