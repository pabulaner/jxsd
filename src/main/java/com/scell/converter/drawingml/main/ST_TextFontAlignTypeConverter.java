package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextFontAlignTypeModel;
import org.docx4j.dml.STTextFontAlignType;

public class ST_TextFontAlignTypeConverter {
  private ST_TextFontAlignTypeConverter() {
  }

  public static ST_TextFontAlignTypeModel fromDocx4j(STTextFontAlignType value) {
    if (value == null) return null;
    if (value == STTextFontAlignType.AUTO) return ST_TextFontAlignTypeModel.AUTO;
    if (value == STTextFontAlignType.T) return ST_TextFontAlignTypeModel.T;
    if (value == STTextFontAlignType.CTR) return ST_TextFontAlignTypeModel.CTR;
    if (value == STTextFontAlignType.BASE) return ST_TextFontAlignTypeModel.BASE;
    if (value == STTextFontAlignType.B) return ST_TextFontAlignTypeModel.B;
    return null;
  }

  public static STTextFontAlignType toDocx4j(ST_TextFontAlignTypeModel value) {
    return null;
  }
}
