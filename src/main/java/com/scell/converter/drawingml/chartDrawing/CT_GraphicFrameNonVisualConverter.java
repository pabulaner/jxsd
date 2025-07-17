package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.CT_NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.CT_NonVisualGraphicFramePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrameNonVisual;

public class CT_GraphicFrameNonVisualConverter {
  private CT_GraphicFrameNonVisualConverter() {
  }

  public static CT_GraphicFrameNonVisualModel fromDocx4j(CTGraphicFrameNonVisual value) {
    if (value == null) return null;
    return new CT_GraphicFrameNonVisualModel(CT_NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), CT_NonVisualGraphicFramePropertiesConverter.fromDocx4j(value.getCNvGraphicFramePr()));
  }

  public static CTGraphicFrameNonVisual toDocx4j(CT_GraphicFrameNonVisualModel value) {
    return null;
  }
}
