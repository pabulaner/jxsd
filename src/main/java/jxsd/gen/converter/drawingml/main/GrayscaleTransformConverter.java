package jxsd.gen.converter.drawingml.main;

import jxsd.gen.model.drawingml.main.GrayscaleTransformModel;
import org.docx4j.dml.CTGrayscaleTransform;

/**
 * This is a generated sequence class.
 */
public class GrayscaleTransformConverter {
  private GrayscaleTransformConverter() {
  }

  public static GrayscaleTransformModel fromDocx4j(CTGrayscaleTransform value) {
    if (value == null) return null;
    return new GrayscaleTransformModel();
  }

  public static CTGrayscaleTransform toDocx4j(GrayscaleTransformModel value) {
    if (value == null) return null;
    CTGrayscaleTransform result = new CTGrayscaleTransform();
    return result;
  }
}
