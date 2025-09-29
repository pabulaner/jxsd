package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GammaTransformModel;
import org.docx4j.dml.CTGammaTransform;

/**
 * This is a generated sequence class.
 */
public class GammaTransformConverter {
  private GammaTransformConverter() {
  }

  public static GammaTransformModel fromDocx4j(CTGammaTransform value) {
    if (value == null) return null;
    return new GammaTransformModel();
  }

  public static CTGammaTransform toDocx4j(GammaTransformModel value) {
    if (value == null) return null;
    CTGammaTransform result = new CTGammaTransform();
    return result;
  }
}
