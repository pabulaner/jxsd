package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextWrappingTypeModel;
import org.docx4j.dml.STTextWrappingType;

public class TextWrappingTypeConverter {
  private TextWrappingTypeConverter() {
  }

  public static TextWrappingTypeModel fromDocx4J(STTextWrappingType value) {
    if (value == null) return null;
    if (value == STTextWrappingType.NONE) return TextWrappingTypeModel.NONE;
    if (value == STTextWrappingType.SQUARE) return TextWrappingTypeModel.SQUARE;
    return null;
  }
}
