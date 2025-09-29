package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.LineChartModel;
import org.docx4j.dml.chart.CTLineChart;

/**
 * This is a generated sequence class.
 */
public class LineChartConverter {
  private LineChartConverter() {
  }

  public static LineChartModel fromDocx4j(CTLineChart value) {
    if (value == null) return null;
    return new LineChartModel(GroupingConverter.fromDocx4j(value.getGrouping()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(LineSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), ChartLinesConverter.fromDocx4j(value.getDropLines()), ChartLinesConverter.fromDocx4j(value.getHiLowLines()), UpDownBarsConverter.fromDocx4j(value.getUpDownBars()), BooleanConverter.fromDocx4j(value.getMarker()), BooleanConverter.fromDocx4j(value.getSmooth()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLineChart toDocx4j(LineChartModel value) {
    if (value == null) return null;
    CTLineChart result = new CTLineChart();
    result.setGrouping(GroupingConverter.toDocx4j(value.getGrouping()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(LineSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setDropLines(ChartLinesConverter.toDocx4j(value.getDropLines()));
    result.setHiLowLines(ChartLinesConverter.toDocx4j(value.getHiLowLines()));
    result.setUpDownBars(UpDownBarsConverter.toDocx4j(value.getUpDownBars()));
    result.setMarker(BooleanConverter.toDocx4j(value.getMarker()));
    result.setSmooth(BooleanConverter.toDocx4j(value.getSmooth()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
