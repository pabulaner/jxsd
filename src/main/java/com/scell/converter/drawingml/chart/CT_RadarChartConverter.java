package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RadarChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTRadarChart;

public class CT_RadarChartConverter {
  private CT_RadarChartConverter() {
  }

  public static CT_RadarChartModel fromDocx4J(CTRadarChart value) {
    if (value == null) return null;
    return new CT_RadarChartModel(CT_RadarStyleConverter.fromDocx4J(value.getRadarStyle()), CT_BooleanConverter.fromDocx4J(value.getVaryColors()), value.getSer().stream().map(CT_RadarSerConverter::fromDocx4J).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4J(value.getDLbls()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTRadarChart toDocx4J(CT_RadarChartModel value) {
    return null;
  }
}
