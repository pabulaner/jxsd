package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.InverseTransformModel;
import org.docx4j.dml.CTInverseTransform;

/**
 * This is a generated sequence class.
 */
public class InverseTransformConverter {
  private InverseTransformConverter() {
  }

  public static InverseTransformModel fromDocx4j(CTInverseTransform value) {
    if (value == null) return null;
    return new InverseTransformModel();
  }

  public static CTInverseTransform toDocx4j(InverseTransformModel value) {
    if (value == null) return null;
    CTInverseTransform result = new CTInverseTransform();
    return result;
  }
}
