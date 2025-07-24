package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextShapeAutofitModel;
import org.docx4j.dml.CTTextShapeAutofit;

public class TextShapeAutofitConverter {
  private TextShapeAutofitConverter() {
  }

  public static TextShapeAutofitModel fromDocx4J(CTTextShapeAutofit value) {
    if (value == null) return null;
    return new TextShapeAutofitModel();
  }
}
