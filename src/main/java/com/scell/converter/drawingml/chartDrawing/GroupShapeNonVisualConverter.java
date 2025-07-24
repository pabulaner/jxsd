package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.NonVisualGroupDrawingShapePropsConverter;
import com.scell.model.drawingml.chartDrawing.GroupShapeNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGroupShapeNonVisual;

public class GroupShapeNonVisualConverter {
  private GroupShapeNonVisualConverter() {
  }

  public static GroupShapeNonVisualModel fromDocx4J(CTGroupShapeNonVisual value) {
    if (value == null) return null;
    return new GroupShapeNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), NonVisualGroupDrawingShapePropsConverter.fromDocx4J(value.getCNvGrpSpPr()));
  }
}
