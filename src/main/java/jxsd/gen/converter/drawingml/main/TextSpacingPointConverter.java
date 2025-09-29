package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.TextSpacingPointModel;
import org.docx4j.dml.CTTextSpacingPoint;

/**
 * This is a generated sequence class.
 */
public class TextSpacingPointConverter {
  private TextSpacingPointConverter() {
  }

  public static TextSpacingPointModel fromDocx4j(CTTextSpacingPoint value) {
    if (value == null) return null;
    return new TextSpacingPointModel(TextSpacingPointValueConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextSpacingPoint toDocx4j(TextSpacingPointModel value) {
    if (value == null) return null;
    CTTextSpacingPoint result = new CTTextSpacingPoint();
    result.setVal(TextSpacingPointValueConverter.toDocx4j(value.getVal()));
    return result;
  }
}
