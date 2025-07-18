package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Pie3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPie3DChart;

public class CT_Pie3DChartConverter {
  private CT_Pie3DChartConverter() {
  }

  public static CT_Pie3DChartModel fromDocx4J(CTPie3DChart value) {
    if (value == null) return null;
    return new CT_Pie3DChartModel(CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTPie3DChart toDocx4J(CT_Pie3DChartModel value) {
    return null;
  }
}
