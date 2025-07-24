package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.Bar3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBar3DChart;

public class Bar3DChartConverter {
  private Bar3DChartConverter() {
  }

  public static Bar3DChartModel fromDocx4J(CTBar3DChart value) {
    if (value == null) return null;
    return new Bar3DChartModel(BarDirConverter.fromDocx4J(value.getBarDir()), BarGroupingConverter.fromDocx4J(value.getGrouping()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(BarSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), GapAmountConverter.fromDocx4J(value.getGapWidth()), GapAmountConverter.fromDocx4J(value.getGapDepth()), ShapeConverter.fromDocx4J(value.getShape()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
