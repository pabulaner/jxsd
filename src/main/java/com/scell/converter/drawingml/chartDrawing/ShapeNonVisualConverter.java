package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.NonVisualDrawingShapePropsConverter;
import com.scell.model.drawingml.chartDrawing.ShapeNonVisualModel;
import org.docx4j.dml.chartDrawing.CTShapeNonVisual;

public class ShapeNonVisualConverter {
  private ShapeNonVisualConverter() {
  }

  public static ShapeNonVisualModel fromDocx4J(CTShapeNonVisual value) {
    if (value == null) return null;
    return new ShapeNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), NonVisualDrawingShapePropsConverter.fromDocx4J(value.getCNvSpPr()));
  }
}
