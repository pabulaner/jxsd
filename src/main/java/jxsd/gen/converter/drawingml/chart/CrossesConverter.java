package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossesModel;
import org.docx4j.dml.chart.CTCrosses;

/**
 * This is a generated sequence class.
 */
public class CrossesConverter {
  private CrossesConverter() {
  }

  public static CrossesModel fromDocx4j(CTCrosses value) {
    if (value == null) return null;
    return new CrossesModel(CrossesValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTCrosses toDocx4j(CrossesModel value) {
    if (value == null) return null;
    CTCrosses result = new CTCrosses();
    result.setVal(CrossesValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
