package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.CT_Surface3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTSurface3DChart;

public class CT_Surface3DChartConverter {
  private CT_Surface3DChartConverter() {
  }

  public static CT_Surface3DChartModel fromDocx4j(CTSurface3DChart value) {
    if (value == null) return null;
    return new CT_Surface3DChartModel(CT_BooleanConverter.fromDocx4j(value.getWireframe()), value.getSer().stream().map(CT_SurfaceSerConverter::fromDocx4j).collect(Collectors.toList()), CT_BandFmtsConverter.fromDocx4j(value.getBandFmts()), value.getAxId().stream().map(CT_UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), CT_ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurface3DChart toDocx4j(CT_Surface3DChartModel value) {
    return null;
  }
}
