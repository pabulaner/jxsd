package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextTabAlignTypeValueModel;
import org.docx4j.dml.STTextTabAlignType;

public class TextTabAlignTypeValueConverter {
  private TextTabAlignTypeValueConverter() {
  }

  public static TextTabAlignTypeValueModel fromDocx4J(STTextTabAlignType value) {
    if (value == null) return null;
    if (value == STTextTabAlignType.L) return TextTabAlignTypeValueModel.L;
    if (value == STTextTabAlignType.CTR) return TextTabAlignTypeValueModel.CTR;
    if (value == STTextTabAlignType.R) return TextTabAlignTypeValueModel.R;
    if (value == STTextTabAlignType.DEC) return TextTabAlignTypeValueModel.DEC;
    return null;
  }
}
