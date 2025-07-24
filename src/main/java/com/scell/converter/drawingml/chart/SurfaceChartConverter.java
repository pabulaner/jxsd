package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SurfaceChartModel;
import java.util.stream.Collectors;
import org.docx4j.dml.chart.CTSurfaceChart;

public class SurfaceChartConverter {
  private SurfaceChartConverter() {
  }

  public static SurfaceChartModel fromDocx4J(CTSurfaceChart value) {
    if (value == null) return null;
    return new SurfaceChartModel(BooleanConverter.fromDocx4J(value.getWireframe()), value.getSer().stream().map(SurfaceSerConverter::fromDocx4J).collect(Collectors.toList()), BandFmtsConverter.fromDocx4J(value.getBandFmts()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4J).collect(Collectors.toList()), ExtensionListConverter.fromDocx4J(value.getExtLst()));
  }
}
