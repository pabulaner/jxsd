package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextNoAutofitModel;
import org.docx4j.dml.CTTextNoAutofit;

public class TextNoAutofitConverter {
  private TextNoAutofitConverter() {
  }

  public static TextNoAutofitModel fromDocx4J(CTTextNoAutofit value) {
    if (value == null) return null;
    return new TextNoAutofitModel();
  }
}
