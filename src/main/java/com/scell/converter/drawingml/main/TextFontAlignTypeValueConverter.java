package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextFontAlignTypeValueModel;
import org.docx4j.dml.STTextFontAlignType;

public class TextFontAlignTypeValueConverter {
  private TextFontAlignTypeValueConverter() {
  }

  public static TextFontAlignTypeValueModel fromDocx4J(STTextFontAlignType value) {
    if (value == null) return null;
    if (value == STTextFontAlignType.AUTO) return TextFontAlignTypeValueModel.AUTO;
    if (value == STTextFontAlignType.T) return TextFontAlignTypeValueModel.T;
    if (value == STTextFontAlignType.CTR) return TextFontAlignTypeValueModel.CTR;
    if (value == STTextFontAlignType.BASE) return TextFontAlignTypeValueModel.BASE;
    if (value == STTextFontAlignType.B) return TextFontAlignTypeValueModel.B;
    return null;
  }
}
