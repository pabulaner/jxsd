package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.AreaChartModel;
import org.docx4j.dml.chart.CTAreaChart;

/**
 * This is a generated sequence class.
 */
public class AreaChartConverter {
  private AreaChartConverter() {
  }

  public static AreaChartModel fromDocx4j(CTAreaChart value) {
    if (value == null) return null;
    return new AreaChartModel(GroupingConverter.fromDocx4j(value.getGrouping()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(AreaSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), ChartLinesConverter.fromDocx4j(value.getDropLines()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTAreaChart toDocx4j(AreaChartModel value) {
    if (value == null) return null;
    CTAreaChart result = new CTAreaChart();
    result.setGrouping(GroupingConverter.toDocx4j(value.getGrouping()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(AreaSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setDropLines(ChartLinesConverter.toDocx4j(value.getDropLines()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
