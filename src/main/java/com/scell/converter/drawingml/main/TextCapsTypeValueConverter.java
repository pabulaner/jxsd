package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextCapsTypeValueModel;
import org.docx4j.dml.STTextCapsType;

public class TextCapsTypeValueConverter {
  private TextCapsTypeValueConverter() {
  }

  public static TextCapsTypeValueModel fromDocx4J(STTextCapsType value) {
    if (value == null) return null;
    if (value == STTextCapsType.NONE) return TextCapsTypeValueModel.NONE;
    if (value == STTextCapsType.SMALL) return TextCapsTypeValueModel.SMALL;
    if (value == STTextCapsType.ALL) return TextCapsTypeValueModel.ALL;
    return null;
  }
}
