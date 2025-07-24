package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.Pie3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTPie3DChart;

public class Pie3DChartConverter {
  private Pie3DChartConverter() {
  }

  public static Pie3DChartModel fromDocx4J(CTPie3DChart value) {
    if (value == null) return null;
    return new Pie3DChartModel(BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(PieSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
