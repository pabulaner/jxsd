package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Bar3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTBar3DChart;

public class CT_Bar3DChartConverter {
  private CT_Bar3DChartConverter() {
  }

  public static CT_Bar3DChartModel fromDocx4j(CTBar3DChart value) {
    if (value == null) return null;
    return new CT_Bar3DChartModel(CT_BarDirConverter.fromDocx4j(value.getBarDir()), CT_BarGroupingConverter.fromDocx4j(value.getGrouping()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_BarSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_GapAmountConverter.fromDocx4j(value.getGapWidth()), CT_GapAmountConverter.fromDocx4j(value.getGapDepth()), CT_ShapeConverter.fromDocx4j(value.getShape()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTBar3DChart toDocx4j(CT_Bar3DChartModel value) {
    return null;
  }
}
