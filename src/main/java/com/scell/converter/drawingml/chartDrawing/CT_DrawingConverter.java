package com.scell.converter.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_DrawingModel;
import org.docx4j.dml.chartDrawing.CTDrawing;

public class CT_DrawingConverter {
  private CT_DrawingConverter() {
  }

  public static CT_DrawingModel fromDocx4j(CTDrawing value) {
    if (value == null) return null;
  }

  public static CTDrawing toDocx4j(CT_DrawingModel value) {
    return null;
  }
}
