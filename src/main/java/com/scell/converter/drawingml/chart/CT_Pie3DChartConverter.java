package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Pie3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPie3DChart;

public class CT_Pie3DChartConverter {
  private CT_Pie3DChartConverter() {
  }

  public static CT_Pie3DChartModel fromDocx4j(CTPie3DChart value) {
    if (value == null) return null;
    return new CT_Pie3DChartModel(CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPie3DChart toDocx4j(CT_Pie3DChartModel value) {
    return null;
  }
}
