package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_Scale2DModel;
import org.docx4j.dml.CTScale2D;

public class CT_Scale2DConverter {
  private CT_Scale2DConverter() {
  }

  public static CT_Scale2DModel fromDocx4J(CTScale2D value) {
    if (value == null) return null;
    return new CT_Scale2DModel(CT_RatioConverter.fromDocx4J(value.getSx()), CT_RatioConverter.fromDocx4J(value.getSy()));
  }

  public static CTScale2D toDocx4J(CT_Scale2DModel value) {
    return null;
  }
}
