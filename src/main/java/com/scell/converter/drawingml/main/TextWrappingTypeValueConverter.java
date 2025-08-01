package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextWrappingTypeValueModel;
import org.docx4j.dml.STTextWrappingType;

public class TextWrappingTypeValueConverter {
  private TextWrappingTypeValueConverter() {
  }

  public static TextWrappingTypeValueModel fromDocx4J(STTextWrappingType value) {
    if (value == null) return null;
    if (value == STTextWrappingType.NONE) return TextWrappingTypeValueModel.NONE;
    if (value == STTextWrappingType.SQUARE) return TextWrappingTypeValueModel.SQUARE;
    return null;
  }
}
