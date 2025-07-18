package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextStrikeTypeModel;
import org.docx4j.dml.STTextStrikeType;

public class ST_TextStrikeTypeConverter {
  private ST_TextStrikeTypeConverter() {
  }

  public static ST_TextStrikeTypeModel fromDocx4J(STTextStrikeType value) {
    if (value == null) return null;
    if (value == STTextStrikeType.NO_STRIKE) return ST_TextStrikeTypeModel.NO_STRIKE;
    if (value == STTextStrikeType.SNG_STRIKE) return ST_TextStrikeTypeModel.SNG_STRIKE;
    if (value == STTextStrikeType.DBL_STRIKE) return ST_TextStrikeTypeModel.DBL_STRIKE;
    return null;
  }

  public static STTextStrikeType toDocx4J(ST_TextStrikeTypeModel value) {
    return null;
  }
}
