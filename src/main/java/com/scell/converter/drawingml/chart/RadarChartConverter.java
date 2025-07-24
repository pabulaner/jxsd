package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RadarChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTRadarChart;

public class RadarChartConverter {
  private RadarChartConverter() {
  }

  public static RadarChartModel fromDocx4J(CTRadarChart value) {
    if (value == null) return null;
    return new RadarChartModel(RadarStyleConverter.fromDocx4J(value.getRadarStyle()), BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(RadarSerConverter::fromDocx4J).collect(Collectors.toList()), DLblsConverter.fromDocx4J(value.getDLbls()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
