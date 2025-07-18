package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.ST_TextAnchoringTypeModel;
import org.docx4j.dml.STTextAnchoringType;

public class ST_TextAnchoringTypeConverter {
  private ST_TextAnchoringTypeConverter() {
  }

  public static ST_TextAnchoringTypeModel fromDocx4J(STTextAnchoringType value) {
    if (value == null) return null;
    if (value == STTextAnchoringType.T) return ST_TextAnchoringTypeModel.T;
    if (value == STTextAnchoringType.CTR) return ST_TextAnchoringTypeModel.CTR;
    if (value == STTextAnchoringType.B) return ST_TextAnchoringTypeModel.B;
    if (value == STTextAnchoringType.JUST) return ST_TextAnchoringTypeModel.JUST;
    if (value == STTextAnchoringType.DIST) return ST_TextAnchoringTypeModel.DIST;
    return null;
  }

  public static STTextAnchoringType toDocx4J(ST_TextAnchoringTypeModel value) {
    return null;
  }
}
