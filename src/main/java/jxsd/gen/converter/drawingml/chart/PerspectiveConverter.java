package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.PerspectiveModel;
import org.docx4j.dml.chart.CTPerspective;

/**
 * This is a generated sequence class.
 */
public class PerspectiveConverter {
  private PerspectiveConverter() {
  }

  public static PerspectiveModel fromDocx4j(CTPerspective value) {
    if (value == null) return null;
    return new PerspectiveModel(PerspectiveValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPerspective toDocx4j(PerspectiveModel value) {
    if (value == null) return null;
    CTPerspective result = new CTPerspective();
    result.setVal(PerspectiveValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
