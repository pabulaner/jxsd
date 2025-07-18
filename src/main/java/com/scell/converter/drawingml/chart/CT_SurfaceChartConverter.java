package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SurfaceChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTSurfaceChart;

public class CT_SurfaceChartConverter {
  private CT_SurfaceChartConverter() {
  }

  public static CT_SurfaceChartModel fromDocx4J(CTSurfaceChart value) {
    if (value == null) return null;
    return new CT_SurfaceChartModel(CT_BooleanConverter.fromDocx4J(value.getWireframe()), value.getSer().stream().map(CT_SurfaceSerConverter::fromDocx4J).collect(Collectors.toList()), CT_BandFmtsConverter.fromDocx4J(value.getBandFmts()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTSurfaceChart toDocx4J(CT_SurfaceChartModel value) {
    return null;
  }
}
