package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Bar3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBar3DChart;

public class CT_Bar3DChartConverter {
  private CT_Bar3DChartConverter() {
  }

  public static CT_Bar3DChartModel fromDocx4J(CTBar3DChart value) {
    if (value == null) return null;
    return new CT_Bar3DChartModel(CT_BarDirConverter.fromDocx4J(value.getBarDir()), CT_BarGroupingConverter.fromDocx4J(value.getGrouping()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_BarSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_GapAmountConverter.fromDocx4J(value.getGapWidth()), CT_GapAmountConverter.fromDocx4J(value.getGapDepth()), CT_ShapeConverter.fromDocx4J(value.getShape()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTBar3DChart toDocx4J(CT_Bar3DChartModel value) {
    return null;
  }
}
