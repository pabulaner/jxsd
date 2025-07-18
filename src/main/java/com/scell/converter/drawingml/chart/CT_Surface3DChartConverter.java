package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Surface3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTSurface3DChart;

public class CT_Surface3DChartConverter {
  private CT_Surface3DChartConverter() {
  }

  public static CT_Surface3DChartModel fromDocx4J(CTSurface3DChart value) {
    if (value == null) return null;
    return new CT_Surface3DChartModel(CT_BooleanConverter.fromDocx4J(value.getWireframe()), value.getSer().stream().map(CT_SurfaceSerConverter::fromDocx4J).collect(Collectors.toList()), CT_BandFmtsConverter.fromDocx4J(value.getBandFmts()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }

  public static CTSurface3DChart toDocx4J(CT_Surface3DChartModel value) {
    return null;
  }
}
