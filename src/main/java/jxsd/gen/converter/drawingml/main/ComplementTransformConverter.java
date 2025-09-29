package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.ComplementTransformModel;
import org.docx4j.dml.CTComplementTransform;

/**
 * This is a generated sequence class.
 */
public class ComplementTransformConverter {
  private ComplementTransformConverter() {
  }

  public static ComplementTransformModel fromDocx4j(CTComplementTransform value) {
    if (value == null) return null;
    return new ComplementTransformModel();
  }

  public static CTComplementTransform toDocx4j(ComplementTransformModel value) {
    if (value == null) return null;
    CTComplementTransform result = new CTComplementTransform();
    return result;
  }
}
