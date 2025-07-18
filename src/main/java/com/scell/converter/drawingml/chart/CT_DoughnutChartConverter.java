package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DoughnutChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTDoughnutChart;

public class CT_DoughnutChartConverter {
  private CT_DoughnutChartConverter() {
  }

  public static CT_DoughnutChartModel fromDocx4J(CTDoughnutChart value) {
    if (value == null) return null;
    return new CT_DoughnutChartModel(CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), CT_FirstSliceAngConverter.fromDocx4J(value.getFirstSliceAng()), CT_HoleSizeConverter.fromDocx4J(value.getHoleSize()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTDoughnutChart toDocx4J(CT_DoughnutChartModel value) {
    return null;
  }
}
