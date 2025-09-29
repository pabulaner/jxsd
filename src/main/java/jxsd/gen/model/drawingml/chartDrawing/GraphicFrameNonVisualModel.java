package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.GraphicFrameNonVisualBuilder;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualGraphicFramePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class GraphicFrameNonVisualModel {
  private final NonVisualDrawingPropsModel cNvPr;

  private final NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public GraphicFrameNonVisualModel(NonVisualDrawingPropsModel cNvPr,
      NonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvPr = cNvPr;
    this.cNvGraphicFramePr = cNvGraphicFramePr;
  }

  public GraphicFrameNonVisualBuilder builder() {
    return new GraphicFrameNonVisualBuilder().from(this);
  }

  public NonVisualDrawingPropsModel getCNvPr() {
    return this.cNvPr;
  }

  public NonVisualGraphicFramePropertiesModel getCNvGraphicFramePr() {
    return this.cNvGraphicFramePr;
  }
}
