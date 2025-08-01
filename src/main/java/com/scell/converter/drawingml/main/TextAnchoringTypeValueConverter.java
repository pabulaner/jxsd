package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextAnchoringTypeValueModel;
import org.docx4j.dml.STTextAnchoringType;

public class TextAnchoringTypeValueConverter {
  private TextAnchoringTypeValueConverter() {
  }

  public static TextAnchoringTypeValueModel fromDocx4J(STTextAnchoringType value) {
    if (value == null) return null;
    if (value == STTextAnchoringType.T) return TextAnchoringTypeValueModel.T;
    if (value == STTextAnchoringType.CTR) return TextAnchoringTypeValueModel.CTR;
    if (value == STTextAnchoringType.B) return TextAnchoringTypeValueModel.B;
    if (value == STTextAnchoringType.JUST) return TextAnchoringTypeValueModel.JUST;
    if (value == STTextAnchoringType.DIST) return TextAnchoringTypeValueModel.DIST;
    return null;
  }
}
