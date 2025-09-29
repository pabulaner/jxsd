package jxsd.gen.converter.drawingml.chartDrawing;

import jxsd.gen.converter.drawingml.main.NonVisualDrawingPropsConverter;
import jxsd.gen.converter.drawingml.main.NonVisualGraphicFramePropertiesConverter;
import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameNonVisualModel;
import org.docx4j.dml.chartDrawing.CTGraphicFrameNonVisual;

/**
 * This is a generated sequence class.
 */
public class GraphicFrameNonVisualConverter {
  private GraphicFrameNonVisualConverter() {
  }

  public static GraphicFrameNonVisualModel fromDocx4j(CTGraphicFrameNonVisual value) {
    if (value == null) return null;
    return new GraphicFrameNonVisualModel(NonVisualDrawingPropsConverter.fromDocx4j(value.getCNvPr()), NonVisualGraphicFramePropertiesConverter.fromDocx4j(value.getCNvGraphicFramePr()));
  }

  public static CTGraphicFrameNonVisual toDocx4j(GraphicFrameNonVisualModel value) {
    if (value == null) return null;
    CTGraphicFrameNonVisual result = new CTGraphicFrameNonVisual();
    result.setCNvPr(NonVisualDrawingPropsConverter.toDocx4j(value.getCNvPr()));
    result.setCNvGraphicFramePr(NonVisualGraphicFramePropertiesConverter.toDocx4j(value.getCNvGraphicFramePr()));
    return result;
  }
}
