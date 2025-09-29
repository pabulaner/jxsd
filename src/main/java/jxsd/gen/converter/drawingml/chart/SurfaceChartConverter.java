package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.SurfaceChartModel;
import org.docx4j.dml.chart.CTSurfaceChart;

/**
 * This is a generated sequence class.
 */
public class SurfaceChartConverter {
  private SurfaceChartConverter() {
  }

  public static SurfaceChartModel fromDocx4j(CTSurfaceChart value) {
    if (value == null) return null;
    return new SurfaceChartModel(BooleanConverter.fromDocx4j(value.getWireframe()), value.getSer().stream().map(SurfaceSerConverter::fromDocx4j).collect(Collectors.toList()), BandFmtsConverter.fromDocx4j(value.getBandFmts()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTSurfaceChart toDocx4j(SurfaceChartModel value) {
    if (value == null) return null;
    CTSurfaceChart result = new CTSurfaceChart();
    result.setWireframe(BooleanConverter.toDocx4j(value.getWireframe()));
    result.getSer().addAll(value.getSer().stream().map(SurfaceSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setBandFmts(BandFmtsConverter.toDocx4j(value.getBandFmts()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
