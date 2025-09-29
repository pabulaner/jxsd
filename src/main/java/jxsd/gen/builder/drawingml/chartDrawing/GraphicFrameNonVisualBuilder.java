package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameNonVisualModel;
import jxsd.gen.model.drawingml.main.NonVisualDrawingPropsModel;
import jxsd.gen.model.drawingml.main.NonVisualGraphicFramePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class GraphicFrameNonVisualBuilder {
  private NonVisualDrawingPropsModel cNvPr;

  private NonVisualGraphicFramePropertiesModel cNvGraphicFramePr;

  public GraphicFrameNonVisualBuilder() {
  }

  public GraphicFrameNonVisualBuilder setCNvPr(NonVisualDrawingPropsModel cNvPr) {
    this.cNvPr = cNvPr;
    return this;
  }

  public GraphicFrameNonVisualBuilder setCNvGraphicFramePr(
      NonVisualGraphicFramePropertiesModel cNvGraphicFramePr) {
    this.cNvGraphicFramePr = cNvGraphicFramePr;
    return this;
  }

  public GraphicFrameNonVisualBuilder from(GraphicFrameNonVisualModel value) {
    this.cNvPr = value.getCNvPr();
    this.cNvGraphicFramePr = value.getCNvGraphicFramePr();
    return this;
  }

  public GraphicFrameNonVisualModel build() {
    return new GraphicFrameNonVisualModel(this.cNvPr, this.cNvGraphicFramePr);
  }
}
