package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextStrikeTypeValueModel;
import org.docx4j.dml.STTextStrikeType;

public class TextStrikeTypeValueConverter {
  private TextStrikeTypeValueConverter() {
  }

  public static TextStrikeTypeValueModel fromDocx4J(STTextStrikeType value) {
    if (value == null) return null;
    if (value == STTextStrikeType.NO_STRIKE) return TextStrikeTypeValueModel.NO_STRIKE;
    if (value == STTextStrikeType.SNG_STRIKE) return TextStrikeTypeValueModel.SNG_STRIKE;
    if (value == STTextStrikeType.DBL_STRIKE) return TextStrikeTypeValueModel.DBL_STRIKE;
    return null;
  }
}
