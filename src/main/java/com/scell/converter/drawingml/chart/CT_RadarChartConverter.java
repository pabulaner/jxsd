package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_RadarChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTRadarChart;

public class CT_RadarChartConverter {
  private CT_RadarChartConverter() {
  }

  public static CT_RadarChartModel fromDocx4j(CTRadarChart value) {
    if (value == null) return null;
    return new CT_RadarChartModel(CT_RadarStyleConverter.fromDocx4j(value.getRadarStyle()), CT_BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(CT_RadarSerConverter::fromDocx4j).collect(Collectors.toList()), CT_DLblsConverter.fromDocx4j(value.getDLbls()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTRadarChart toDocx4j(CT_RadarChartModel value) {
    return null;
  }
}
