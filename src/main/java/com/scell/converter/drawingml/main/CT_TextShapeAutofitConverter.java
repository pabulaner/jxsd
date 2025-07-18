package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextShapeAutofitModel;
import org.docx4j.dml.CTTextShapeAutofit;

public class CT_TextShapeAutofitConverter {
  private CT_TextShapeAutofitConverter() {
  }

  public static CT_TextShapeAutofitModel fromDocx4J(CTTextShapeAutofit value) {
    if (value == null) return null;
    return new CT_TextShapeAutofitModel();
  }

  public static CTTextShapeAutofit toDocx4J(CT_TextShapeAutofitModel value) {
    return null;
  }
}
