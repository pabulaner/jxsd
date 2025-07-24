package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.Scale2DModel;
import org.docx4j.dml.CTScale2D;

public class Scale2DConverter {
  private Scale2DConverter() {
  }

  public static Scale2DModel fromDocx4J(CTScale2D value) {
    if (value == null) return null;
    return new Scale2DModel(RatioConverter.fromDocx4J(value.getSx()), RatioConverter.fromDocx4J(value.getSy()));
  }
}
