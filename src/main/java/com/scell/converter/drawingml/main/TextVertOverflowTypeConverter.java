package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextVertOverflowTypeModel;
import org.docx4j.dml.STTextVertOverflowType;

public class TextVertOverflowTypeConverter {
  private TextVertOverflowTypeConverter() {
  }

  public static TextVertOverflowTypeModel fromDocx4J(STTextVertOverflowType value) {
    if (value == null) return null;
    if (value == STTextVertOverflowType.OVERFLOW) return TextVertOverflowTypeModel.OVERFLOW;
    if (value == STTextVertOverflowType.ELLIPSIS) return TextVertOverflowTypeModel.ELLIPSIS;
    if (value == STTextVertOverflowType.CLIP) return TextVertOverflowTypeModel.CLIP;
    return null;
  }
}
