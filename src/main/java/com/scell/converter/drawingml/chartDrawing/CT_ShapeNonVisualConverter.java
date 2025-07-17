package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.CT_NonVisualDrawingShapePropsConverter;
import com.scell.model.drawingml.chartDrawing.CT_ShapeNonVisualModel;
import org.docx4j.dml.chartDrawing.CTShapeNonVisual;

public class CT_ShapeNonVisualConverter {
  private CT_ShapeNonVisualConverter() {
  }

  public static CT_ShapeNonVisualModel fromDocx4j(CTShapeNonVisual value) {
    if (value == null) return null;
    return new CT_ShapeNonVisualModel(CT_NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), CT_NonVisualDrawingShapePropsConverter.fromDocx4j(value.getCNvSpPr()));
  }

  public static CTShapeNonVisual toDocx4j(CT_ShapeNonVisualModel value) {
    return null;
  }
}
