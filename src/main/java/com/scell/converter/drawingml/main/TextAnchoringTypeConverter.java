package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextAnchoringTypeModel;
import org.docx4j.dml.STTextAnchoringType;

public class TextAnchoringTypeConverter {
  private TextAnchoringTypeConverter() {
  }

  public static TextAnchoringTypeModel fromDocx4J(STTextAnchoringType value) {
    if (value == null) return null;
    if (value == STTextAnchoringType.T) return TextAnchoringTypeModel.T;
    if (value == STTextAnchoringType.CTR) return TextAnchoringTypeModel.CTR;
    if (value == STTextAnchoringType.B) return TextAnchoringTypeModel.B;
    if (value == STTextAnchoringType.JUST) return TextAnchoringTypeModel.JUST;
    if (value == STTextAnchoringType.DIST) return TextAnchoringTypeModel.DIST;
    return null;
  }
}
