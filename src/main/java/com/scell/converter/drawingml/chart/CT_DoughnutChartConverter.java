package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DoughnutChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTDoughnutChart;

public class CT_DoughnutChartConverter {
  private CT_DoughnutChartConverter() {
  }

  public static CT_DoughnutChartModel fromDocx4j(CTDoughnutChart value) {
    if (value == null) return null;
    return new CT_DoughnutChartModel(CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_PieSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), CT_FirstSliceAngConverter.fromDocx4j(value.getFirstSliceAng()), CT_HoleSizeConverter.fromDocx4j(value.getHoleSize()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTDoughnutChart toDocx4j(CT_DoughnutChartModel value) {
    return null;
  }
}
