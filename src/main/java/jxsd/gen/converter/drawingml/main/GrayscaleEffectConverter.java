package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GrayscaleEffectModel;
import org.docx4j.dml.CTGrayscaleEffect;

/**
 * This is a generated sequence class.
 */
public class GrayscaleEffectConverter {
  private GrayscaleEffectConverter() {
  }

  public static GrayscaleEffectModel fromDocx4j(CTGrayscaleEffect value) {
    if (value == null) return null;
    return new GrayscaleEffectModel();
  }

  public static CTGrayscaleEffect toDocx4j(GrayscaleEffectModel value) {
    if (value == null) return null;
    CTGrayscaleEffect result = new CTGrayscaleEffect();
    return result;
  }
}
