package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.Line3DChartModel;
import org.docx4j.dml.chart.CTLine3DChart;

/**
 * This is a generated sequence class.
 */
public class Line3DChartConverter {
  private Line3DChartConverter() {
  }

  public static Line3DChartModel fromDocx4j(CTLine3DChart value) {
    if (value == null) return null;
    return new Line3DChartModel(GroupingConverter.fromDocx4j(value.getGrouping()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(LineSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), ChartLinesConverter.fromDocx4j(value.getDropLines()), GapAmountConverter.fromDocx4j(value.getGapDepth()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTLine3DChart toDocx4j(Line3DChartModel value) {
    if (value == null) return null;
    CTLine3DChart result = new CTLine3DChart();
    result.setGrouping(GroupingConverter.toDocx4j(value.getGrouping()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(LineSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setDropLines(ChartLinesConverter.toDocx4j(value.getDropLines()));
    result.setGapDepth(GapAmountConverter.toDocx4j(value.getGapDepth()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
