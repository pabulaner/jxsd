package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextAlignTypeValueModel;
import org.docx4j.dml.STTextAlignType;

public class TextAlignTypeValueConverter {
  private TextAlignTypeValueConverter() {
  }

  public static TextAlignTypeValueModel fromDocx4J(STTextAlignType value) {
    if (value == null) return null;
    if (value == STTextAlignType.L) return TextAlignTypeValueModel.L;
    if (value == STTextAlignType.CTR) return TextAlignTypeValueModel.CTR;
    if (value == STTextAlignType.R) return TextAlignTypeValueModel.R;
    if (value == STTextAlignType.JUST) return TextAlignTypeValueModel.JUST;
    if (value == STTextAlignType.JUST_LOW) return TextAlignTypeValueModel.JUST_LOW;
    if (value == STTextAlignType.DIST) return TextAlignTypeValueModel.DIST;
    if (value == STTextAlignType.THAI_DIST) return TextAlignTypeValueModel.THAI_DIST;
    return null;
  }
}
