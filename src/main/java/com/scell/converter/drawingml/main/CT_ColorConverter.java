package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.CT_ColorModel;
import org.docx4j.dml.CTColor;

public class CT_ColorConverter {
  private CT_ColorConverter() {
  }

  public static CT_ColorModel fromDocx4j(CTColor value) {
    if (value == null) return null;
  }

  public static CTColor toDocx4j(CT_ColorModel value) {
    return null;
  }
}
