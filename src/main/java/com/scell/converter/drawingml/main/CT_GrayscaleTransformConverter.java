package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_GrayscaleTransformModel;
import org.docx4j.dml.CTGrayscaleTransform;

public class CT_GrayscaleTransformConverter {
  private CT_GrayscaleTransformConverter() {
  }

  public static CT_GrayscaleTransformModel fromDocx4J(CTGrayscaleTransform value) {
    if (value == null) return null;
    return new CT_GrayscaleTransformModel();
  }

  public static CTGrayscaleTransform toDocx4J(CT_GrayscaleTransformModel value) {
    return null;
  }
}
