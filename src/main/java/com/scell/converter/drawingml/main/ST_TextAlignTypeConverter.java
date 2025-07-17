package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextAlignTypeModel;
import org.docx4j.dml.STTextAlignType;

public class ST_TextAlignTypeConverter {
  private ST_TextAlignTypeConverter() {
  }

  public static ST_TextAlignTypeModel fromDocx4j(STTextAlignType value) {
    if (value == null) return null;
    if (value == STTextAlignType.L) return ST_TextAlignTypeModel.L;
    if (value == STTextAlignType.CTR) return ST_TextAlignTypeModel.CTR;
    if (value == STTextAlignType.R) return ST_TextAlignTypeModel.R;
    if (value == STTextAlignType.JUST) return ST_TextAlignTypeModel.JUST;
    if (value == STTextAlignType.JUST_LOW) return ST_TextAlignTypeModel.JUST_LOW;
    if (value == STTextAlignType.DIST) return ST_TextAlignTypeModel.DIST;
    if (value == STTextAlignType.THAI_DIST) return ST_TextAlignTypeModel.THAI_DIST;
    return null;
  }

  public static STTextAlignType toDocx4j(ST_TextAlignTypeModel value) {
    return null;
  }
}
