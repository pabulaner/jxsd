package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextAlignTypeModel;
import org.docx4j.dml.STTextAlignType;

public class TextAlignTypeConverter {
  private TextAlignTypeConverter() {
  }

  public static TextAlignTypeModel fromDocx4J(STTextAlignType value) {
    if (value == null) return null;
    if (value == STTextAlignType.L) return TextAlignTypeModel.L;
    if (value == STTextAlignType.CTR) return TextAlignTypeModel.CTR;
    if (value == STTextAlignType.R) return TextAlignTypeModel.R;
    if (value == STTextAlignType.JUST) return TextAlignTypeModel.JUST;
    if (value == STTextAlignType.JUST_LOW) return TextAlignTypeModel.JUST_LOW;
    if (value == STTextAlignType.DIST) return TextAlignTypeModel.DIST;
    if (value == STTextAlignType.THAI_DIST) return TextAlignTypeModel.THAI_DIST;
    return null;
  }
}
