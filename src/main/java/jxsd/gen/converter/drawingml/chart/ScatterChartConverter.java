package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.ScatterChartModel;
import org.docx4j.dml.chart.CTScatterChart;

/**
 * This is a generated sequence class.
 */
public class ScatterChartConverter {
  private ScatterChartConverter() {
  }

  public static ScatterChartModel fromDocx4j(CTScatterChart value) {
    if (value == null) return null;
    return new ScatterChartModel(ScatterStyleConverter.fromDocx4j(value.getScatterStyle()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(ScatterSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTScatterChart toDocx4j(ScatterChartModel value) {
    if (value == null) return null;
    CTScatterChart result = new CTScatterChart();
    result.setScatterStyle(ScatterStyleConverter.toDocx4j(value.getScatterStyle()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(ScatterSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
