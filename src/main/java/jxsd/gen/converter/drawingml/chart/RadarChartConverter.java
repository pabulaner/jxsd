package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.RadarChartModel;
import org.docx4j.dml.chart.CTRadarChart;

/**
 * This is a generated sequence class.
 */
public class RadarChartConverter {
  private RadarChartConverter() {
  }

  public static RadarChartModel fromDocx4j(CTRadarChart value) {
    if (value == null) return null;
    return new RadarChartModel(RadarStyleConverter.fromDocx4j(value.getRadarStyle()), BooleanConverter.fromDocx4j(value.getVaryColors()), value.getSer().stream().map(RadarSerConverter::fromDocx4j).collect(Collectors.toList()), DLblsConverter.fromDocx4j(value.getDLbls()), value.getAxId().stream().map(UnsignedIntConverter::fromDocx4j).collect(Collectors.toList()), ExtensionListConverter.fromDocx4j(value.getExtLst()));
  }

  public static CTRadarChart toDocx4j(RadarChartModel value) {
    if (value == null) return null;
    CTRadarChart result = new CTRadarChart();
    result.setRadarStyle(RadarStyleConverter.toDocx4j(value.getRadarStyle()));
    result.setVaryColors(BooleanConverter.toDocx4j(value.getVaryColors()));
    result.getSer().addAll(value.getSer().stream().map(RadarSerConverter::toDocx4j).collect(Collectors.toList()));
    result.setDLbls(DLblsConverter.toDocx4j(value.getDLbls()));
    result.getAxId().addAll(value.getAxId().stream().map(UnsignedIntConverter::toDocx4j).collect(Collectors.toList()));
    result.setExtLst(ExtensionListConverter.toDocx4j(value.getExtLst()));
    return result;
  }
}
