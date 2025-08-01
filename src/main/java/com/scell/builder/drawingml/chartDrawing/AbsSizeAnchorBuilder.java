package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.AbsSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.ConnectorModel;
import com.scell.model.drawingml.chartDrawing.GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.GroupShapeModel;
import com.scell.model.drawingml.chartDrawing.MarkerModel;
import com.scell.model.drawingml.chartDrawing.PictureModel;
import com.scell.model.drawingml.chartDrawing.ShapeModel;
import com.scell.model.drawingml.main.PositiveSize2DModel;
import java.lang.Object;

public class AbsSizeAnchorBuilder {
  private MarkerModel from;

  private PositiveSize2DModel ext;

  private AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame;

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
      AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public AbsSizeAnchorModel build() {
    return new AbsSizeAnchorModel(this.from, this.ext, this.spOrGrpSpOrGraphicFrame);
  }

  public AbsSizeAnchorBuilder from(AbsSizeAnchorModel value) {
    this.from = value.getFrom();
    this.ext = value.getExt();
    this.spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame();
    return this;
  }

  public static class SpOrGrpSpOrGraphicFrameValueBuilder {
    private int type;

    private Object value;

    public SpOrGrpSpOrGraphicFrameValueBuilder() {
      this.type = -1;
      this.value = null;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder setSp(ShapeModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder setGrpSp(GroupShapeModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder setGraphicFrame(GraphicFrameModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder setCxnSp(ConnectorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder setPic(PictureModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel build() {
      if (this.type == -1) return new AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel();
      if (this.type == 0) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newSp((ShapeModel) this.value);
      if (this.type == 1) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newPic((PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder from(
        AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel value) {
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
  }
}
