package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextVerticalTypeValueModel;
import org.docx4j.dml.STTextVerticalType;

public class TextVerticalTypeValueConverter {
  private TextVerticalTypeValueConverter() {
  }

  public static TextVerticalTypeValueModel fromDocx4J(STTextVerticalType value) {
    if (value == null) return null;
    if (value == STTextVerticalType.HORZ) return TextVerticalTypeValueModel.HORZ;
    if (value == STTextVerticalType.VERT) return TextVerticalTypeValueModel.VERT;
    if (value == STTextVerticalType.VERT_270) return TextVerticalTypeValueModel.VERT_270;
    if (value == STTextVerticalType.WORD_ART_VERT) return TextVerticalTypeValueModel.WORD_ART_VERT;
    if (value == STTextVerticalType.EA_VERT) return TextVerticalTypeValueModel.EA_VERT;
    if (value == STTextVerticalType.MONGOLIAN_VERT) return TextVerticalTypeValueModel.MONGOLIAN_VERT;
    if (value == STTextVerticalType.WORD_ART_VERT_RTL) return TextVerticalTypeValueModel.WORD_ART_VERT_RTL;
    return null;
  }
}
