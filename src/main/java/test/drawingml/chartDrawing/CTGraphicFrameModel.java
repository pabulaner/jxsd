package test.drawingml.chartDrawing;

import test.XMLSchema.BooleanModel;
import test.XMLSchema.StringModel;
import test.drawingml.main.CTGraphicalObjectModel;
import test.drawingml.main.CTTransform2DModel;

public class CTGraphicFrameModel {
  private final BooleanModel fPublished;

  private final StringModel macro;

  private final CTGraphicFrameNonVisualModel nvGraphicFramePr;

  private final CTTransform2DModel xfrm;

  private final CTGraphicalObjectModel graphic;

  public CTGraphicFrameModel(BooleanModel fPublished, StringModel macro,
      CTGraphicFrameNonVisualModel nvGraphicFramePr, CTTransform2DModel xfrm,
      CTGraphicalObjectModel graphic) {
    this.fPublished = fPublished;
    this.macro = macro;
    this.nvGraphicFramePr = nvGraphicFramePr;
    this.xfrm = xfrm;
    this.graphic = graphic;
  }

  public BooleanModel getFPublished() {
    return this.fPublished;
  }

  public StringModel getMacro() {
    return this.macro;
  }

  public CTGraphicFrameNonVisualModel getNvGraphicFramePr() {
    return this.nvGraphicFramePr;
  }

  public CTTransform2DModel getXfrm() {
    return this.xfrm;
  }

  public CTGraphicalObjectModel getGraphic() {
    return this.graphic;
  }
}
