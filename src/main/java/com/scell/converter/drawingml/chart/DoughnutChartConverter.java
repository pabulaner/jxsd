package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.DoughnutChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTDoughnutChart;

public class DoughnutChartConverter {
  private DoughnutChartConverter() {
  }

  public static DoughnutChartModel fromDocx4J(CTDoughnutChart value) {
    if (value == null) return null;
    return new DoughnutChartModel(BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), FirstSliceAngConverter.fromDocx4J(value.getFirstSliceAng()), HoleSizeConverter.fromDocx4J(value.getHoleSize()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
