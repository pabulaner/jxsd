package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.TextNormalAutofitModel;
import org.docx4j.dml.CTTextNormalAutofit;

public class TextNormalAutofitConverter {
  private TextNormalAutofitConverter() {
  }

  public static TextNormalAutofitModel fromDocx4J(CTTextNormalAutofit value) {
    if (value == null) return null;
    return new TextNormalAutofitModel(TextFontScalePercentValueConverter.fromDocx4J(value.getFontScale()), TextSpacingPercentValueConverter.fromDocx4J(value.getLnSpcReduction()));
  }
}
