package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.OfPieChartModel;
import org.docx4j.dml.chart.CTOfPieChart;

/**
 * This is a generated sequence class.
 */
public class OfPieChartConverter {
  private OfPieChartConverter() {
  }

  public static OfPieChartModel fromDocx4j(CTOfPieChart value) {
    if (value == null) return null;
    return new OfPieChartModel(OfPieTypeConverter.fromDocx4j(value.getOfPieType()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), GapAmountConverter.fromDocx4j(value.getGapWidth()), SplitTypeConverter.fromDocx4j(value.getSplitType()), DoubleConverter.fromDocx4j(value.getSplitPos()), CustSplitConverter.fromDocx4j(value.getCustSplit()), SecondPieSizeConverter.fromDocx4j(value.getSecondPieSize()), value.getSerLines().stream().map(ChartLinesConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTOfPieChart toDocx4j(OfPieChartModel value) {
    if (value == null) return null;
    CTOfPieChart result = new CTOfPieChart();
    result.setOfPieType(OfPieTypeConverter.toDocx4j(value.getOfPieType()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(PieSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setGapWidth(GapAmountConverter.toDocx4j(value.getGapWidth()));
    result.setSplitType(SplitTypeConverter.toDocx4j(value.getSplitType()));
    result.setSplitPos(DoubleConverter.toDocx4j(value.getSplitPos()));
    result.setCustSplit(CustSplitConverter.toDocx4j(value.getCustSplit()));
    result.setSecondPieSize(SecondPieSizeConverter.toDocx4j(value.getSecondPieSize()));
    result.getSerLines().addAll(value.getSerLines().stream().map(ChartLinesConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
