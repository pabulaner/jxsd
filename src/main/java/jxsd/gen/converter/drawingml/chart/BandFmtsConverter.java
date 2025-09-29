package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.BandFmtsModel;
import org.docx4j.dml.chart.CTBandFmts;

/**
 * This is a generated sequence class.
 */
public class BandFmtsConverter {
  private BandFmtsConverter() {
  }

  public static BandFmtsModel fromDocx4j(CTBandFmts value) {
    if (value == null) return null;
    return new BandFmtsModel(value.getBandFmt().stream().map(BandFmtConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTBandFmts toDocx4j(BandFmtsModel value) {
    if (value == null) return null;
    CTBandFmts result = new CTBandFmts();
    result.getBandFmt().addAll(value.getBandFmt().stream().map(BandFmtConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
