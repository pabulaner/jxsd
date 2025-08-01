package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.PositiveSize2DModel;
import java.lang.Integer;
import java.lang.Object;

public class AbsSizeAnchorModel {
  private final MarkerModel from;

  private final PositiveSize2DModel ext;

  private final SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame;

  public AbsSizeAnchorModel(MarkerModel from, PositiveSize2DModel ext,
      SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame) {
    this.from = from;
    this.ext = ext;
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
  }

  public MarkerModel getFrom() {
    return this.from;
  }

  public PositiveSize2DModel getExt() {
    return this.ext;
  }

  public SpOrGrpSpOrGraphicFrameValueModel getSpOrGrpSpOrGraphicFrame() {
    return this.spOrGrpSpOrGraphicFrame;
  }

  public static class SpOrGrpSpOrGraphicFrameValueModel {
    private final int type;

    private final Object value;

    public SpOrGrpSpOrGraphicFrameValueModel() {
      this(-1, null);
    }

    private SpOrGrpSpOrGraphicFrameValueModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static SpOrGrpSpOrGraphicFrameValueModel newSp(ShapeModel value) {
      return new SpOrGrpSpOrGraphicFrameValueModel(0, value);
    }

    public boolean isSp() {
      return this.type == 0;
    }

    public ShapeModel getSp() {
      return (ShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameValueModel newGrpSp(GroupShapeModel value) {
      return new SpOrGrpSpOrGraphicFrameValueModel(1, value);
    }

    public boolean isGrpSp() {
      return this.type == 1;
    }

    public GroupShapeModel getGrpSp() {
      return (GroupShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameValueModel newGraphicFrame(GraphicFrameModel value) {
      return new SpOrGrpSpOrGraphicFrameValueModel(2, value);
    }

    public boolean isGraphicFrame() {
      return this.type == 2;
    }

    public GraphicFrameModel getGraphicFrame() {
      return (GraphicFrameModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameValueModel newCxnSp(ConnectorModel value) {
      return new SpOrGrpSpOrGraphicFrameValueModel(3, value);
    }

    public boolean isCxnSp() {
      return this.type == 3;
    }

    public ConnectorModel getCxnSp() {
      return (ConnectorModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameValueModel newPic(PictureModel value) {
      return new SpOrGrpSpOrGraphicFrameValueModel(4, value);
    }

    public boolean isPic() {
      return this.type == 4;
    }

    public PictureModel getPic() {
      return (PictureModel) this.value;
    }
  }
}
