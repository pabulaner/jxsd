package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.CT_NonVisualGroupDrawingShapePropsConverter;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGroupShapeNonVisual;

public class CT_GroupShapeNonVisualConverter {
  private CT_GroupShapeNonVisualConverter() {
  }

  public static CT_GroupShapeNonVisualModel fromDocx4j(CTGroupShapeNonVisual value) {
    if (value == null) return null;
    return new CT_GroupShapeNonVisualModel(CT_NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), CT_NonVisualGroupDrawingShapePropsConverter.fromDocx4j(value.getCNvGrpSpPr()));
  }

  public static CTGroupShapeNonVisual toDocx4j(CT_GroupShapeNonVisualModel value) {
    return null;
  }
}
