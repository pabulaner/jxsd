package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextStrikeTypeModel;
import org.docx4j.dml.STTextStrikeType;

public class TextStrikeTypeConverter {
  private TextStrikeTypeConverter() {
  }

  public static TextStrikeTypeModel fromDocx4J(STTextStrikeType value) {
    if (value == null) return null;
    if (value == STTextStrikeType.NO_STRIKE) return TextStrikeTypeModel.NO_STRIKE;
    if (value == STTextStrikeType.SNG_STRIKE) return TextStrikeTypeModel.SNG_STRIKE;
    if (value == STTextStrikeType.DBL_STRIKE) return TextStrikeTypeModel.DBL_STRIKE;
    return null;
  }
}
