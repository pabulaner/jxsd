package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextCapsTypeModel;
import org.docx4j.dml.STTextCapsType;

public class ST_TextCapsTypeConverter {
  private ST_TextCapsTypeConverter() {
  }

  public static ST_TextCapsTypeModel fromDocx4j(STTextCapsType value) {
    if (value == null) return null;
    if (value == STTextCapsType.NONE) return ST_TextCapsTypeModel.NONE;
    if (value == STTextCapsType.SMALL) return ST_TextCapsTypeModel.SMALL;
    if (value == STTextCapsType.ALL) return ST_TextCapsTypeModel.ALL;
    return null;
  }

  public static STTextCapsType toDocx4j(ST_TextCapsTypeModel value) {
    return null;
  }
}
