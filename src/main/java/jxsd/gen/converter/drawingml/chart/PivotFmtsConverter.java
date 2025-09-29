package jxsd.gen.converter.drawingml.chart;

import java.util.stream.Collectors;
import jxsd.gen.model.drawingml.chart.PivotFmtsModel;
import org.docx4j.dml.chart.CTPivotFmts;

/**
 * This is a generated sequence class.
 */
public class PivotFmtsConverter {
  private PivotFmtsConverter() {
  }

  public static PivotFmtsModel fromDocx4j(CTPivotFmts value) {
    if (value == null) return null;
    return new PivotFmtsModel(value.getPivotFmt().stream().map(PivotFmtConverter::fromDocx4j).collect(Collectors.toList()));
  }

  public static CTPivotFmts toDocx4j(PivotFmtsModel value) {
    if (value == null) return null;
    CTPivotFmts result = new CTPivotFmts();
    result.getPivotFmt().addAll(value.getPivotFmt().stream().map(PivotFmtConverter::toDocx4j).collect(Collectors.toList()));
    return result;
  }
}
