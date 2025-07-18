package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_FlatTextModel;
import org.docx4j.dml.CTFlatText;

public class CT_FlatTextConverter {
  private CT_FlatTextConverter() {
  }

  public static CT_FlatTextModel fromDocx4J(CTFlatText value) {
    if (value == null) return null;
    return new CT_FlatTextModel(ST_CoordinateConverter.fromDocx4J(value.getZ()));
  }

  public static CTFlatText toDocx4J(CT_FlatTextModel value) {
    return null;
  }
}
