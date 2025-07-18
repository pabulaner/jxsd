package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextVerticalTypeModel;
import org.docx4j.dml.STTextVerticalType;

public class ST_TextVerticalTypeConverter {
  private ST_TextVerticalTypeConverter() {
  }

  public static ST_TextVerticalTypeModel fromDocx4J(STTextVerticalType value) {
    if (value == null) return null;
    if (value == STTextVerticalType.HORZ) return ST_TextVerticalTypeModel.HORZ;
    if (value == STTextVerticalType.VERT) return ST_TextVerticalTypeModel.VERT;
    if (value == STTextVerticalType.VERT_270) return ST_TextVerticalTypeModel.VERT_270;
    if (value == STTextVerticalType.WORD_ART_VERT) return ST_TextVerticalTypeModel.WORD_ART_VERT;
    if (value == STTextVerticalType.EA_VERT) return ST_TextVerticalTypeModel.EA_VERT;
    if (value == STTextVerticalType.MONGOLIAN_VERT) return ST_TextVerticalTypeModel.MONGOLIAN_VERT;
    if (value == STTextVerticalType.WORD_ART_VERT_RTL) return ST_TextVerticalTypeModel.WORD_ART_VERT_RTL;
    return null;
  }

  public static STTextVerticalType toDocx4J(ST_TextVerticalTypeModel value) {
    return null;
  }
}
