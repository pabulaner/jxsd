package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextHorzOverflowTypeModel;
import org.docx4j.dml.STTextHorzOverflowType;

public class ST_TextHorzOverflowTypeConverter {
  private ST_TextHorzOverflowTypeConverter() {
  }

  public static ST_TextHorzOverflowTypeModel fromDocx4j(STTextHorzOverflowType value) {
    if (value == null) return null;
    if (value == STTextHorzOverflowType.OVERFLOW) return ST_TextHorzOverflowTypeModel.OVERFLOW;
    if (value == STTextHorzOverflowType.CLIP) return ST_TextHorzOverflowTypeModel.CLIP;
    return null;
  }

  public static STTextHorzOverflowType toDocx4j(ST_TextHorzOverflowTypeModel value) {
    return null;
  }
}
