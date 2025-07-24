package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextTabAlignTypeModel;
import org.docx4j.dml.STTextTabAlignType;

public class TextTabAlignTypeConverter {
  private TextTabAlignTypeConverter() {
  }

  public static TextTabAlignTypeModel fromDocx4J(STTextTabAlignType value) {
    if (value == null) return null;
    if (value == STTextTabAlignType.L) return TextTabAlignTypeModel.L;
    if (value == STTextTabAlignType.CTR) return TextTabAlignTypeModel.CTR;
    if (value == STTextTabAlignType.R) return TextTabAlignTypeModel.R;
    if (value == STTextTabAlignType.DEC) return TextTabAlignTypeModel.DEC;
    return null;
  }
}
