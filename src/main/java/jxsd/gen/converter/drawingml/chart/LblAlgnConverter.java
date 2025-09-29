package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.LblAlgnModel;
import org.docx4j.dml.chart.CTLblAlgn;

/**
 * This is a generated sequence class.
 */
public class LblAlgnConverter {
  private LblAlgnConverter() {
  }

  public static LblAlgnModel fromDocx4j(CTLblAlgn value) {
    if (value == null) return null;
    return new LblAlgnModel(LblAlgnValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTLblAlgn toDocx4j(LblAlgnModel value) {
    if (value == null) return null;
    CTLblAlgn result = new CTLblAlgn();
    result.setVal(LblAlgnValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
