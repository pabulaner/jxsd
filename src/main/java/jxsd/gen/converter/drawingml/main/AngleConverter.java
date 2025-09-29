package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AngleModel;
import org.docx4j.dml.CTAngle;

/**
 * This is a generated sequence class.
 */
public class AngleConverter {
  private AngleConverter() {
  }

  public static AngleModel fromDocx4j(CTAngle value) {
    if (value == null) return null;
    return new AngleModel(AngleValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTAngle toDocx4j(AngleModel value) {
    if (value == null) return null;
    CTAngle result = new CTAngle();
    result.setVal(AngleValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
