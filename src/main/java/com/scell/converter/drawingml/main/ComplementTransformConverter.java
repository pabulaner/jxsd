package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ComplementTransformModel;
import org.docx4j.dml.CTComplementTransform;

public class ComplementTransformConverter {
  private ComplementTransformConverter() {
  }

  public static ComplementTransformModel fromDocx4J(CTComplementTransform value) {
    if (value == null) return null;
    return new ComplementTransformModel();
  }
}
