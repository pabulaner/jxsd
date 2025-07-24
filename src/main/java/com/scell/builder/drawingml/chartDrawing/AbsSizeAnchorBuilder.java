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

  private AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;

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
      AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
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

  public static class SpOrGrpSpOrGraphicFrameBuilder {
    private int type;

    private Object value;

    public SpOrGrpSpOrGraphicFrameBuilder() {
      this.type = -1;
      this.value = null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setSp(ShapeModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setGrpSp(GroupShapeModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setGraphicFrame(GraphicFrameModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setCxnSp(ConnectorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setPic(PictureModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel build() {
      if (this.type == -1) return new AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
      if (this.type == 0) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp((ShapeModel) this.value);
      if (this.type == 1) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic((PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder from(
        AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel value) {
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
