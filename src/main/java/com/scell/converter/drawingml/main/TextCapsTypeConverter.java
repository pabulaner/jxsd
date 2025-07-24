package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextCapsTypeModel;
import org.docx4j.dml.STTextCapsType;

public class TextCapsTypeConverter {
  private TextCapsTypeConverter() {
  }

  public static TextCapsTypeModel fromDocx4J(STTextCapsType value) {
    if (value == null) return null;
    if (value == STTextCapsType.NONE) return TextCapsTypeModel.NONE;
    if (value == STTextCapsType.SMALL) return TextCapsTypeModel.SMALL;
    if (value == STTextCapsType.ALL) return TextCapsTypeModel.ALL;
    return null;
  }
}
