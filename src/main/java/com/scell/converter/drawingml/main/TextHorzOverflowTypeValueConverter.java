package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextHorzOverflowTypeValueModel;
import org.docx4j.dml.STTextHorzOverflowType;

public class TextHorzOverflowTypeValueConverter {
  private TextHorzOverflowTypeValueConverter() {
  }

  public static TextHorzOverflowTypeValueModel fromDocx4J(STTextHorzOverflowType value) {
    if (value == null) return null;
    if (value == STTextHorzOverflowType.OVERFLOW) return TextHorzOverflowTypeValueModel.OVERFLOW;
    if (value == STTextHorzOverflowType.CLIP) return TextHorzOverflowTypeValueModel.CLIP;
    return null;
  }
}
