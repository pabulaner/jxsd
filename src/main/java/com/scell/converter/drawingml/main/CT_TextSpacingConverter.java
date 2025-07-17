package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_TextSpacingModel;
import org.docx4j.dml.CTTextSpacing;

public class CT_TextSpacingConverter {
  private CT_TextSpacingConverter() {
  }

  public static CT_TextSpacingModel fromDocx4j(CTTextSpacing value) {
    if (value == null) return null;
  }

  public static CTTextSpacing toDocx4j(CT_TextSpacingModel value) {
    return null;
  }
}
