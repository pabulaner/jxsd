package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.Surface3DChartModel;
import org.docx4j.dml.chart.CTSurface3DChart;

/**
 * This is a generated sequence class.
 */
public class Surface3DChartConverter {
  private Surface3DChartConverter() {
  }

  public static Surface3DChartModel fromDocx4j(CTSurface3DChart value) {
    if (value == null) return null;
    return new Surface3DChartModel(BooleanConverter.fromDocx4j(value.getWireframe()), value.getSer().stream().map(SurfaceSerConverter::fromDocx4j).collect(Collectors.toList()), BandFmtsConverter.fromDocx4j(value.getBandFmts()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurface3DChart toDocx4j(Surface3DChartModel value) {
    if (value == null) return null;
    CTSurface3DChart result = new CTSurface3DChart();
    result.setWireframe(BooleanConverter.toDocx4j(value.getWireframe()));
    result.getSer().addAll(value.getSer().stream().map(SurfaceSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setBandFmts(BandFmtsConverter.toDocx4j(value.getBandFmts()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
