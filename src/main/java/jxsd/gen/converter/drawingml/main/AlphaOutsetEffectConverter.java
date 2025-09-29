package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.AlphaOutsetEffectModel;
import org.docx4j.dml.CTAlphaOutsetEffect;

/**
 * This is a generated sequence class.
 */
public class AlphaOutsetEffectConverter {
  private AlphaOutsetEffectConverter() {
  }

  public static AlphaOutsetEffectModel fromDocx4j(CTAlphaOutsetEffect value) {
    if (value == null) return null;
    return new AlphaOutsetEffectModel(CoordinateValueConverter.fromDocx4j(value.getRad()));
  }

  public static CTAlphaOutsetEffect toDocx4j(AlphaOutsetEffectModel value) {
    if (value == null) return null;
    CTAlphaOutsetEffect result = new CTAlphaOutsetEffect();
    result.setRad(CoordinateValueConverter.toDocx4j(value.getRad()));
    return result;
  }
}
