package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.PieChartModel;
import org.docx4j.dml.chart.CTPieChart;

/**
 * This is a generated sequence class.
 */
public class PieChartConverter {
  private PieChartConverter() {
  }

  public static PieChartModel fromDocx4j(CTPieChart value) {
    if (value == null) return null;
    return new PieChartModel(BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), FirstSliceAngConverter.fromDocx4j(value.getFirstSliceAng()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPieChart toDocx4j(PieChartModel value) {
    if (value == null) return null;
    CTPieChart result = new CTPieChart();
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(PieSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setFirstSliceAng(FirstSliceAngConverter.toDocx4j(value.getFirstSliceAng()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
