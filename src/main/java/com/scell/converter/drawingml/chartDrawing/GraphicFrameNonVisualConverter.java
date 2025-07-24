package com.scell.converter.drawingml.chartDrawing;

import com.scell.converter.drawingml.main.NonVisualDrawingPropsConverter;
import com.scell.converter.drawingml.main.NonVisualGraphicFramePropertiesConverter;
import com.scell.model.drawingml.chartDrawing.GraphicFrameNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrameNonVisual;

public class GraphicFrameNonVisualConverter {
  private GraphicFrameNonVisualConverter() {
  }

  public static GraphicFrameNonVisualModel fromDocx4J(CTGraphicFrameNonVisual value) {
    if (value == null) return null;
    return new GraphicFrameNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4J(value.getCNvPr()), NonVisualGraphicFramePropertiesConverter.fromDocx4J(value.getCNvGraphicFramePr()));
  }
}
