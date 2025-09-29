package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.Bar3DChartModel;
import org.docx4j.dml.chart.CTBar3DChart;

/**
 * This is a generated sequence class.
 */
public class Bar3DChartConverter {
  private Bar3DChartConverter() {
  }

  public static Bar3DChartModel fromDocx4j(CTBar3DChart value) {
    if (value == null) return null;
    return new Bar3DChartModel(BarDirConverter.fromDocx4j(value.getBarDir()), BarGroupingConverter.fromDocx4j(value.getGrouping()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(BarSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), GapAmountConverter.fromDocx4j(value.getGapWidth()), GapAmountConverter.fromDocx4j(value.getGapDepth()), ShapeConverter.fromDocx4j(value.getShape()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBar3DChart toDocx4j(Bar3DChartModel value) {
    if (value == null) return null;
    CTBar3DChart result = new CTBar3DChart();
    result.setBarDir(BarDirConverter.toDocx4j(value.getBarDir()));
    result.setGrouping(BarGroupingConverter.toDocx4j(value.getGrouping()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(BarSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.setGapWidth(GapAmountConverter.toDocx4j(value.getGapWidth()));
    result.setGapDepth(GapAmountConverter.toDocx4j(value.getGapDepth()));
    result.setShape(ShapeConverter.toDocx4j(value.getShape()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
