package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ScatterChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTScatterChart;

public class ScatterChartConverter {
  private ScatterChartConverter() {
  }

  public static ScatterChartModel fromDocx4J(CTScatterChart value) {
    if (value == null) return null;
    return new ScatterChartModel(ScatterStyleConverter.fromDocx4J(value.getScatterStyle()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(ScatterSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
