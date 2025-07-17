package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingPercentModel;
import org.docx4j.dml.CTTextSpacingPercent;

public class CT_TextSpacingPercentConverter {
  private CT_TextSpacingPercentConverter() {
  }

  public static CT_TextSpacingPercentModel fromDocx4j(CTTextSpacingPercent value) {
    if (value == null) return null;
    return new CT_TextSpacingPercentModel(ST_TextSpacingPercentConverter.fromDocx4j(value.getVal()));
  }

  public static CTTextSpacingPercent toDocx4j(CT_TextSpacingPercentModel value) {
    return null;
  }
}
