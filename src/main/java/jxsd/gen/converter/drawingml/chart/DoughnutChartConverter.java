package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.DoughnutChartModel;
import org.docx4j.dml.chart.CTDoughnutChart;

/**
 * This is a generated sequence class.
 */
public class DoughnutChartConverter {
  private DoughnutChartConverter() {
  }

  public static DoughnutChartModel fromDocx4j(CTDoughnutChart value) {
    if (value == null) return null;
    return new DoughnutChartModel(BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), FirstSliceAngConverter.fromDocx4j(value.getFirstSliceAng()), HoleSizeConverter.fromDocx4j(value.getHoleSize()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDoughnutChart toDocx4j(DoughnutChartModel value) {
    if (value == null) return null;
    CTDoughnutChart result = new CTDoughnutChart();
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(PieSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setFirstSliceAng(FirstSliceAngConverter.toDocx4j(value.getFirstSliceAng()));
    result.setHoleSize(HoleSizeConverter.toDocx4j(value.getHoleSize()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
