package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextTabAlignTypeModel;
import org.docx4j.dml.STTextTabAlignType;

public class ST_TextTabAlignTypeConverter {
  private ST_TextTabAlignTypeConverter() {
  }

  public static ST_TextTabAlignTypeModel fromDocx4J(STTextTabAlignType value) {
    if (value == null) return null;
    if (value == STTextTabAlignType.L) return ST_TextTabAlignTypeModel.L;
    if (value == STTextTabAlignType.CTR) return ST_TextTabAlignTypeModel.CTR;
    if (value == STTextTabAlignType.R) return ST_TextTabAlignTypeModel.R;
    if (value == STTextTabAlignType.DEC) return ST_TextTabAlignTypeModel.DEC;
    return null;
  }

  public static STTextTabAlignType toDocx4J(ST_TextTabAlignTypeModel value) {
    return null;
  }
}
