package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextVerticalTypeModel;
import org.docx4j.dml.STTextVerticalType;

public class TextVerticalTypeConverter {
  private TextVerticalTypeConverter() {
  }

  public static TextVerticalTypeModel fromDocx4J(STTextVerticalType value) {
    if (value == null) return null;
    if (value == STTextVerticalType.HORZ) return TextVerticalTypeModel.HORZ;
    if (value == STTextVerticalType.VERT) return TextVerticalTypeModel.VERT;
    if (value == STTextVerticalType.VERT_270) return TextVerticalTypeModel.VERT_270;
    if (value == STTextVerticalType.WORD_ART_VERT) return TextVerticalTypeModel.WORD_ART_VERT;
    if (value == STTextVerticalType.EA_VERT) return TextVerticalTypeModel.EA_VERT;
    if (value == STTextVerticalType.MONGOLIAN_VERT) return TextVerticalTypeModel.MONGOLIAN_VERT;
    if (value == STTextVerticalType.WORD_ART_VERT_RTL) return TextVerticalTypeModel.WORD_ART_VERT_RTL;
    return null;
  }
}
