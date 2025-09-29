package jxsd.gen.builder.drawingml.chartDrawing;

import java.lang.Object;
import jxsd.gen.model.drawingml.chartDrawing.AbsSizeAnchorModel;
import jxsd.gen.model.drawingml.chartDrawing.ConnectorModel;
import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameModel;
import jxsd.gen.model.drawingml.chartDrawing.GroupShapeModel;
import jxsd.gen.model.drawingml.chartDrawing.MarkerModel;
import jxsd.gen.model.drawingml.chartDrawing.PictureModel;
import jxsd.gen.model.drawingml.chartDrawing.ShapeModel;
import jxsd.gen.model.drawingml.main.PositiveSize2DModel;

/**
 * This is a generated sequence class.
 */
public class AbsSizeAnchorBuilder {
  private MarkerModel from;

  private PositiveSize2DModel ext;

  private AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame;

  public AbsSizeAnchorBuilder() {
  }

  public AbsSizeAnchorBuilder setFrom(MarkerModel from) {
    this.from = from;
    return this;
  }

  public AbsSizeAnchorBuilder setExt(PositiveSize2DModel ext) {
    this.ext = ext;
    return this;
  }

  public AbsSizeAnchorBuilder setSpOrGrpSpOrGraphicFrame(
      AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public AbsSizeAnchorBuilder from(AbsSizeAnchorModel value) {
    this.from = value.getFrom();
    this.ext = value.getExt();
    this.spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame();
    return this;
  }

  public AbsSizeAnchorModel build() {
    return new AbsSizeAnchorModel(this.from, this.ext, this.spOrGrpSpOrGraphicFrame);
  }

  /**
   * This is a generated choice class.
   */
  public static class SpOrGrpSpOrGraphicFrame {
    private int type;

    private Object value;

    public SpOrGrpSpOrGraphicFrame() {
      this.type = -1;
      this.value = null;
    }

    public SpOrGrpSpOrGraphicFrame setSp(ShapeModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrame setGrpSp(GroupShapeModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrame setGraphicFrame(GraphicFrameModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrame setCxnSp(ConnectorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrame setPic(PictureModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrame from(AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame value) {
      this.type = -1;
      this.value = null;
      if (value.isSp()) {
        this.type = 0;
        this.value = value.getSp();
      }
      if (value.isGrpSp()) {
        this.type = 1;
        this.value = value.getGrpSp();
      }
      if (value.isGraphicFrame()) {
        this.type = 2;
        this.value = value.getGraphicFrame();
      }
      if (value.isCxnSp()) {
        this.type = 3;
        this.value = value.getCxnSp();
      }
      if (value.isPic()) {
        this.type = 4;
        this.value = value.getPic();
      }
      return this;
    }

    public AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame build() {
      if (this.type == -1) return new AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame();
      if (this.type == 0) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newSp((ShapeModel) this.value);
      if (this.type == 1) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newPic((PictureModel) this.value);
      return null;
    }
  }
}
