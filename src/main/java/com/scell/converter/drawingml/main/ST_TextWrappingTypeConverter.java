package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextWrappingTypeModel;
import org.docx4j.dml.STTextWrappingType;

public class ST_TextWrappingTypeConverter {
  private ST_TextWrappingTypeConverter() {
  }

  public static ST_TextWrappingTypeModel fromDocx4J(STTextWrappingType value) {
    if (value == null) return null;
    if (value == STTextWrappingType.NONE) return ST_TextWrappingTypeModel.NONE;
    if (value == STTextWrappingType.SQUARE) return ST_TextWrappingTypeModel.SQUARE;
    return null;
  }

  public static STTextWrappingType toDocx4J(ST_TextWrappingTypeModel value) {
    return null;
  }
}
