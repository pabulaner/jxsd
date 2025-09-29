package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.Scale2DModel;
import org.docx4j.dml.CTScale2D;

/**
 * This is a generated sequence class.
 */
public class Scale2DConverter {
  private Scale2DConverter() {
  }

  public static Scale2DModel fromDocx4j(CTScale2D value) {
    if (value == null) return null;
    return new Scale2DModel(RatioConverter.fromDocx4j(value.getSx()), RatioConverter.fromDocx4j(value.getSy()));
  }

  public static CTScale2D toDocx4j(Scale2DModel value) {
    if (value == null) return null;
    CTScale2D result = new CTScale2D();
    result.setSx(RatioConverter.toDocx4j(value.getSx()));
    result.setSy(RatioConverter.toDocx4j(value.getSy()));
    return result;
  }
}
