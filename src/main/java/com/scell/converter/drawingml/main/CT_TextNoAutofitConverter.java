package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextNoAutofitModel;
import org.docx4j.dml.CTTextNoAutofit;

public class CT_TextNoAutofitConverter {
  private CT_TextNoAutofitConverter() {
  }

  public static CT_TextNoAutofitModel fromDocx4J(CTTextNoAutofit value) {
    if (value == null) return null;
    return new CT_TextNoAutofitModel();
  }

  public static CTTextNoAutofit toDocx4J(CT_TextNoAutofitModel value) {
    return null;
  }
}
