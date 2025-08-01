package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextVertOverflowTypeValueModel;
import org.docx4j.dml.STTextVertOverflowType;

public class TextVertOverflowTypeValueConverter {
  private TextVertOverflowTypeValueConverter() {
  }

  public static TextVertOverflowTypeValueModel fromDocx4J(STTextVertOverflowType value) {
    if (value == null) return null;
    if (value == STTextVertOverflowType.OVERFLOW) return TextVertOverflowTypeValueModel.OVERFLOW;
    if (value == STTextVertOverflowType.ELLIPSIS) return TextVertOverflowTypeValueModel.ELLIPSIS;
    if (value == STTextVertOverflowType.CLIP) return TextVertOverflowTypeValueModel.CLIP;
    return null;
  }
}
