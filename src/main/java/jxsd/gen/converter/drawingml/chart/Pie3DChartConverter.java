package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.Pie3DChartModel;
import org.docx4j.dml.chart.CTPie3DChart;

/**
 * This is a generated sequence class.
 */
public class Pie3DChartConverter {
  private Pie3DChartConverter() {
  }

  public static Pie3DChartModel fromDocx4j(CTPie3DChart value) {
    if (value == null) return null;
    return new Pie3DChartModel(BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPie3DChart toDocx4j(Pie3DChartModel value) {
    if (value == null) return null;
    CTPie3DChart result = new CTPie3DChart();
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(PieSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
