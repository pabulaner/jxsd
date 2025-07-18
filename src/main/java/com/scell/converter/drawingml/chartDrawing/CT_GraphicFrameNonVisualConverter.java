package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.CT_NonVisualGraphicFramePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrameNonVisual;

public class CT_GraphicFrameNonVisualConverter {
  private CT_GraphicFrameNonVisualConverter() {
  }

  public static CT_GraphicFrameNonVisualModel fromDocx4J(CTGraphicFrameNonVisual value) {
    if (value == null) return null;
    return new CT_GraphicFrameNonVisualModel(CT_NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), CT_NonVisualGraphicFramePropertiesConverter.fromDocx4J(value.getCNvGraphicFramePr()));
  }

  public static CTGraphicFrameNonVisual toDocx4J(CT_GraphicFrameNonVisualModel value) {
    return null;
  }
}
