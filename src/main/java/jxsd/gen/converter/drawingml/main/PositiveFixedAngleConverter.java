package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.PositiveFixedAngleModel;
import org.docx4j.dml.CTPositiveFixedAngle;

/**
 * This is a generated sequence class.
 */
public class PositiveFixedAngleConverter {
  private PositiveFixedAngleConverter() {
  }

  public static PositiveFixedAngleModel fromDocx4j(CTPositiveFixedAngle value) {
    if (value == null) return null;
    return new PositiveFixedAngleModel(PositiveFixedAngleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTPositiveFixedAngle toDocx4j(PositiveFixedAngleModel value) {
    if (value == null) return null;
    CTPositiveFixedAngle result = new CTPositiveFixedAngle();
    result.setVal(PositiveFixedAngleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
