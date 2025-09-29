package jxsd.gen.converter.drawingml.chart;

import jxsd.gen.model.drawingml.chart.CrossBetweenModel;
import org.docx4j.dml.chart.CTCrossBetween;

/**
 * This is a generated sequence class.
 */
public class CrossBetweenConverter {
  private CrossBetweenConverter() {
  }

  public static CrossBetweenModel fromDocx4j(CTCrossBetween value) {
    if (value == null) return null;
    return new CrossBetweenModel(CrossBetweenValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTCrossBetween toDocx4j(CrossBetweenModel value) {
    if (value == null) return null;
    CTCrossBetween result = new CTCrossBetween();
    result.setVal(CrossBetweenValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
