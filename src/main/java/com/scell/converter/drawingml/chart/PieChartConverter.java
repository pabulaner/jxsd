package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PieChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPieChart;

public class PieChartConverter {
  private PieChartConverter() {
  }

  public static PieChartModel fromDocx4J(CTPieChart value) {
    if (value == null) return null;
    return new PieChartModel(BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), FirstSliceAngConverter.fromDocx4J(value.getFirstSliceAng()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
