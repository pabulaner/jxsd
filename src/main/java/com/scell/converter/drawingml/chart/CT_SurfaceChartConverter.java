package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SurfaceChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTSurfaceChart;

public class CT_SurfaceChartConverter {
  private CT_SurfaceChartConverter() {
  }

  public static CT_SurfaceChartModel fromDocx4j(CTSurfaceChart value) {
    if (value == null) return null;
    return new CT_SurfaceChartModel(CT_BooleanConverter.fromDocx4j(value.getWireframe()), value.getSer().stream().map(CT_SurfaceSerConverter::fromDocx4j).collect(Collectors.toList()), CT_BandFmtsConverter.fromDocx4j(value.getBandFmts()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurfaceChart toDocx4j(CT_SurfaceChartModel value) {
    return null;
  }
}
