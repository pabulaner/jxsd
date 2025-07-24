package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextFontAlignTypeModel;
import org.docx4j.dml.STTextFontAlignType;

public class TextFontAlignTypeConverter {
  private TextFontAlignTypeConverter() {
  }

  public static TextFontAlignTypeModel fromDocx4J(STTextFontAlignType value) {
    if (value == null) return null;
    if (value == STTextFontAlignType.AUTO) return TextFontAlignTypeModel.AUTO;
    if (value == STTextFontAlignType.T) return TextFontAlignTypeModel.T;
    if (value == STTextFontAlignType.CTR) return TextFontAlignTypeModel.CTR;
    if (value == STTextFontAlignType.BASE) return TextFontAlignTypeModel.BASE;
    if (value == STTextFontAlignType.B) return TextFontAlignTypeModel.B;
    return null;
  }
}
