package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.BarChartModel;
import org.docx4j.dml.chart.CTBarChart;

/**
 * This is a generated sequence class.
 */
public class BarChartConverter {
  private BarChartConverter() {
  }

  public static BarChartModel fromDocx4j(CTBarChart value) {
    if (value == null) return null;
    return new BarChartModel(BarDirConverter.fromDocx4j(value.getBarDir()), BarGroupingConverter.fromDocx4j(value.getGrouping()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(BarSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), GapAmountConverter.fromDocx4j(value.getGapWidth()), OverlapConverter.fromDocx4j(value.getOverlap()), value.getSerLines().stream().map(ChartLinesConverter::fromDocx4j).collect(Collectors.toList()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBarChart toDocx4j(BarChartModel value) {
    if (value == null) return null;
    CTBarChart result = new CTBarChart();
    result.setBarDir(BarDirConverter.toDocx4j(value.getBarDir()));
    result.setGrouping(BarGroupingConverter.toDocx4j(value.getGrouping()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(BarSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setGapWidth(GapAmountConverter.toDocx4j(value.getGapWidth()));
    result.setOverlap(OverlapConverter.toDocx4j(value.getOverlap()));
    result.getSerLines().addAll(value.getSerLines().stream().map(ChartLinesConverter::toDocx4j).collect(Collectors.toList()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
