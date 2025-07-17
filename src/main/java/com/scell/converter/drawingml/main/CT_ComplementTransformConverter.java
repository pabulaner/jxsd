package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ComplementTransformModel;
import org.docx4j.dml.CTComplementTransform;

public class CT_ComplementTransformConverter {
  private CT_ComplementTransformConverter() {
  }

  public static CT_ComplementTransformModel fromDocx4j(CTComplementTransform value) {
    if (value == null) return null;
    return new CT_ComplementTransformModel();
  }

  public static CTComplementTransform toDocx4j(CT_ComplementTransformModel value) {
    return null;
  }
}
