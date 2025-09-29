package jxsd.gen.model.drawingml.chartDrawing;

import jxsd.gen.builder.drawingml.chartDrawing.GraphicFrameBuilder;
import jxsd.gen.model.drawingml.main.GraphicValueModel;
import jxsd.gen.model.drawingml.main.Transform2DModel;

/**
 * This is a generated sequence class.
 */
public class GraphicFrameModel {
  private final boolean fPublished;

  private final String macro;

  private final GraphicFrameNonVisualModel nvGraphicFramePr;

  private final Transform2DModel xfrm;

  private final GraphicValueModel graphic;

  public GraphicFrameModel(boolean fPublished, String macro,
      GraphicFrameNonVisualModel nvGraphicFramePr, Transform2DModel xfrm,
      GraphicValueModel graphic) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvGraphicFramePr = nvGraphicFramePr;
    this.xfrm = xfrm;
    this.graphic = graphic;
  }

  public GraphicFrameBuilder builder() {
    return new GraphicFrameBuilder().from(this);
  }

  public boolean getFPublished() {
    return this.fPublished;
  }

  public String getMacro() {
    return this.macro;
  }

  public GraphicFrameNonVisualModel getNvGraphicFramePr() {
    return this.nvGraphicFramePr;
  }

  public Transform2DModel getXfrm() {
    return this.xfrm;
  }

  public GraphicValueModel getGraphic() {
    return this.graphic;
  }
}
