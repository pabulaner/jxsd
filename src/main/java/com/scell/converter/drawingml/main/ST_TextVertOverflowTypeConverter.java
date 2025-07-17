package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextVertOverflowTypeModel;
import org.docx4j.dml.STTextVertOverflowType;

public class ST_TextVertOverflowTypeConverter {
  private ST_TextVertOverflowTypeConverter() {
  }

  public static ST_TextVertOverflowTypeModel fromDocx4j(STTextVertOverflowType value) {
    if (value == null) return null;
    if (value == STTextVertOverflowType.OVERFLOW) return ST_TextVertOverflowTypeModel.OVERFLOW;
    if (value == STTextVertOverflowType.ELLIPSIS) return ST_TextVertOverflowTypeModel.ELLIPSIS;
    if (value == STTextVertOverflowType.CLIP) return ST_TextVertOverflowTypeModel.CLIP;
    return null;
  }

  public static STTextVertOverflowType toDocx4j(ST_TextVertOverflowTypeModel value) {
    return null;
  }
}
