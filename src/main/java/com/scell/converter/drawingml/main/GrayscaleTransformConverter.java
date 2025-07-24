package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.GrayscaleTransformModel;
import org.docx4j.dml.CTGrayscaleTransform;

public class GrayscaleTransformConverter {
  private GrayscaleTransformConverter() {
  }

  public static GrayscaleTransformModel fromDocx4J(CTGrayscaleTransform value) {
    if (value == null) return null;
    return new GrayscaleTransformModel();
  }
}
