package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextHorzOverflowTypeModel;
import org.docx4j.dml.STTextHorzOverflowType;

public class TextHorzOverflowTypeConverter {
  private TextHorzOverflowTypeConverter() {
  }

  public static TextHorzOverflowTypeModel fromDocx4J(STTextHorzOverflowType value) {
    if (value == null) return null;
    if (value == STTextHorzOverflowType.OVERFLOW) return TextHorzOverflowTypeModel.OVERFLOW;
    if (value == STTextHorzOverflowType.CLIP) return TextHorzOverflowTypeModel.CLIP;
    return null;
  }
}
