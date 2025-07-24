package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.Surface3DChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTSurface3DChart;

public class Surface3DChartConverter {
  private Surface3DChartConverter() {
  }

  public static Surface3DChartModel fromDocx4J(CTSurface3DChart value) {
    if (value == null) return null;
    return new Surface3DChartModel(BooleanConverter.fromDocx4J(value.getWireframe()), value.getSer().stream().map(SurfaceSerConverter::fromDocx4J).collect(Collectors.toList()), BandFmtsConverter.fromDocx4J(value.getBandFmts()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
