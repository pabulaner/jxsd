package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextNormalAutofitModel;
import org.docx4j.dml.CTTextNormalAutofit;

public class CT_TextNormalAutofitConverter {
  private CT_TextNormalAutofitConverter() {
  }

  public static CT_TextNormalAutofitModel fromDocx4j(CTTextNormalAutofit value) {
    if (value == null) return null;
    return new CT_TextNormalAutofitModel(ST_TextFontScalePercentConverter.fromDocx4j(value.getFontScale()), ST_TextSpacingPercentConverter.fromDocx4j(value.getLnSpcReduction()));
  }

  public static CTTextNormalAutofit toDocx4j(CT_TextNormalAutofitModel value) {
    return null;
  }
}
