package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextNormalAutofitModel;
import org.docx4j.dml.CTTextNormalAutofit;

public class CT_TextNormalAutofitConverter {
  private CT_TextNormalAutofitConverter() {
  }

  public static CT_TextNormalAutofitModel fromDocx4J(CTTextNormalAutofit value) {
    if (value == null) return null;
    return new CT_TextNormalAutofitModel(ST_TextFontScalePercentConverter.fromDocx4J(value.getFontScale()), ST_TextSpacingPercentConverter.fromDocx4J(value.getLnSpcReduction()));
  }

  public static CTTextNormalAutofit toDocx4J(CT_TextNormalAutofitModel value) {
    return null;
  }
}
