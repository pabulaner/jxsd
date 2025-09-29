package jxsd.gen.builder.drawingml.chartDrawing;

import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameModel;
import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameNonVisualModel;
import jxsd.gen.model.drawingml.main.GraphicValueModel;
import jxsd.gen.model.drawingml.main.Transform2DModel;

/**
 * This is a generated sequence class.
 */
public class GraphicFrameBuilder {
  private boolean fPublished;

  private String macro;

  private GraphicFrameNonVisualModel nvGraphicFramePr;

  private Transform2DModel xfrm;

  private GraphicValueModel graphic;

  public GraphicFrameBuilder() {
  }

  public GraphicFrameBuilder setFPublished(boolean fPublished) {
    this.fPublished = fPublished;
    return this;
  }

  public GraphicFrameBuilder setMacro(String macro) {
    this.macro = macro;
    return this;
  }

  public GraphicFrameBuilder setNvGraphicFramePr(GraphicFrameNonVisualModel nvGraphicFramePr) {
    this.nvGraphicFramePr = nvGraphicFramePr;
    return this;
  }

  public GraphicFrameBuilder setXfrm(Transform2DModel xfrm) {
    this.xfrm = xfrm;
    return this;
  }

  public GraphicFrameBuilder setGraphic(GraphicValueModel graphic) {
    this.graphic = graphic;
    return this;
  }

  public GraphicFrameBuilder from(GraphicFrameModel value) {
    this.fPublished = value.getFPublished();
    this.macro = value.getMacro();
    this.nvGraphicFramePr = value.getNvGraphicFramePr();
    this.xfrm = value.getXfrm();
    this.graphic = value.getGraphic();
    return this;
  }

  public GraphicFrameModel build() {
    return new GraphicFrameModel(this.fPublished, this.macro, this.nvGraphicFramePr, this.xfrm, this.graphic);
  }
}
