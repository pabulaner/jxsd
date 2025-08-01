package com.scell.converter.drawingml.main;

import com.scell.model.drawingml.main.LineEndWidthValueModel;
import org.docx4j.dml.STLineEndWidth;

public class LineEndWidthValueConverter {
  private LineEndWidthValueConverter() {
  }

  public static LineEndWidthValueModel fromDocx4J(STLineEndWidth value) {
    if (value == null) return null;
    if (value == STLineEndWidth.SM) return LineEndWidthValueModel.SM;
    if (value == STLineEndWidth.MED) return LineEndWidthValueModel.MED;
    if (value == STLineEndWidth.LG) return LineEndWidthValueModel.LG;
    return null;
  }
}
