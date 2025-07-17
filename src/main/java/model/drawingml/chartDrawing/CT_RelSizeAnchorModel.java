package model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;

public class CT_RelSizeAnchorModel {
  private final CT_MarkerModel from;

  private final CT_MarkerModel to;

  private final spOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;

  public CT_RelSizeAnchorModel(CT_MarkerModel from, CT_MarkerModel to,
      spOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
    this.from = from;
    this.to = to;
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
  }

  public CT_MarkerModel getFrom() {
    return this.from;
  }

  public CT_MarkerModel getTo() {
    return this.to;
  }

  public spOrGrpSpOrGraphicFrameModel getSpOrGrpSpOrGraphicFrame() {
    return this.spOrGrpSpOrGraphicFrame;
  }

  public static class spOrGrpSpOrGraphicFrameModel {
    private final int type;

    private final Object value;

    public spOrGrpSpOrGraphicFrameModel() {
      this(-1, null);
    }

    private spOrGrpSpOrGraphicFrameModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static spOrGrpSpOrGraphicFrameModel newSp(CT_ShapeModel value) {
      return new spOrGrpSpOrGraphicFrameModel(0, value);
    }

    public boolean isSp() {
      return this.type == 0;
    }

    public CT_ShapeModel getSp() {
      return (CT_ShapeModel) this.value;
    }

    public static spOrGrpSpOrGraphicFrameModel newGrpSp(CT_GroupShapeModel value) {
      return new spOrGrpSpOrGraphicFrameModel(1, value);
    }

    public boolean isGrpSp() {
      return this.type == 1;
    }

    public CT_GroupShapeModel getGrpSp() {
      return (CT_GroupShapeModel) this.value;
    }

    public static spOrGrpSpOrGraphicFrameModel newGraphicFrame(CT_GraphicFrameModel value) {
      return new spOrGrpSpOrGraphicFrameModel(2, value);
    }

    public boolean isGraphicFrame() {
      return this.type == 2;
    }

    public CT_GraphicFrameModel getGraphicFrame() {
      return (CT_GraphicFrameModel) this.value;
    }

    public static spOrGrpSpOrGraphicFrameModel newCxnSp(CT_ConnectorModel value) {
      return new spOrGrpSpOrGraphicFrameModel(3, value);
    }

    public boolean isCxnSp() {
      return this.type == 3;
    }

    public CT_ConnectorModel getCxnSp() {
      return (CT_ConnectorModel) this.value;
    }

    public static spOrGrpSpOrGraphicFrameModel newPic(CT_PictureModel value) {
      return new spOrGrpSpOrGraphicFrameModel(4, value);
    }

    public boolean isPic() {
      return this.type == 4;
    }

    public CT_PictureModel getPic() {
      return (CT_PictureModel) this.value;
    }
  }
}
