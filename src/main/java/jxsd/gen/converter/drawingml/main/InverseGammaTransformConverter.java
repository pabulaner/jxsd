package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.InverseGammaTransformModel;
import org.docx4j.dml.CTInverseGammaTransform;

/**
 * This is a generated sequence class.
 */
public class InverseGammaTransformConverter {
  private InverseGammaTransformConverter() {
  }

  public static InverseGammaTransformModel fromDocx4j(CTInverseGammaTransform value) {
    if (value == null) return null;
    return new InverseGammaTransformModel();
  }

  public static CTInverseGammaTransform toDocx4j(InverseGammaTransformModel value) {
    if (value == null) return null;
    CTInverseGammaTransform result = new CTInverseGammaTransform();
    return result;
  }
}
