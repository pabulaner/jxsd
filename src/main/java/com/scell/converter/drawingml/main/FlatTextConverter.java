package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.FlatTextModel;
import org.docx4j.dml.CTFlatText;

public class FlatTextConverter {
  private FlatTextConverter() {
  }

  public static FlatTextModel fromDocx4J(CTFlatText value) {
    if (value == null) return null;
    return new FlatTextModel(CoordinateValueConverter.fromDocx4J(value.getZ()));
  }
}
