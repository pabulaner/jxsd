package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PieChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPieChart;

public class CT_PieChartConverter {
  private CT_PieChartConverter() {
  }

  public static CT_PieChartModel fromDocx4j(CTPieChart value) {
    if (value == null) return null;
    return new CT_PieChartModel(CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_FirstSliceAngConverter.fromDocx4j(value.getFirstSliceAng()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTPieChart toDocx4j(CT_PieChartModel value) {
    return null;
  }
}
