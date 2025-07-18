package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_AbsSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.CT_ConnectorModel;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeModel;
import com.scell.model.drawingml.chartDrawing.CT_MarkerModel;
import com.scell.model.drawingml.chartDrawing.CT_PictureModel;
import com.scell.model.drawingml.chartDrawing.CT_ShapeModel;
import com.scell.model.drawingml.main.CT_PositiveSize2DModel;
import java.lang.Object;

public class CT_AbsSizeAnchorBuilder {
  private CT_MarkerModel from;

  private CT_PositiveSize2DModel ext;

  private CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;

  public CT_AbsSizeAnchorBuilder() {
  }

  public CT_AbsSizeAnchorBuilder setFrom(CT_MarkerModel from) {
    this.from = from;
    return this;
  }

  public CT_AbsSizeAnchorBuilder setExt(CT_PositiveSize2DModel ext) {
    this.ext = ext;
    return this;
  }

  public CT_AbsSizeAnchorBuilder setSpOrGrpSpOrGraphicFrame(
      CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public CT_AbsSizeAnchorModel build() {
    return new CT_AbsSizeAnchorModel(this.from, this.ext, this.spOrGrpSpOrGraphicFrame);
  }

  public CT_AbsSizeAnchorBuilder from(CT_AbsSizeAnchorModel value) {
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

    public SpOrGrpSpOrGraphicFrameBuilder setSp(CT_ShapeModel value) {
      this.type = 0;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setGrpSp(CT_GroupShapeModel value) {
      this.type = 1;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setGraphicFrame(CT_GraphicFrameModel value) {
      this.type = 2;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setCxnSp(CT_ConnectorModel value) {
      this.type = 3;
      this.value = value;
      return this;
    }

    public SpOrGrpSpOrGraphicFrameBuilder setPic(CT_PictureModel value) {
      this.type = 4;
      this.value = value;
      return this;
    }

    public CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel build() {
      if (this.type == -1) return new CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
      if (this.type == 0) return CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp((CT_ShapeModel) this.value);
      if (this.type == 1) return CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp((CT_GroupShapeModel) this.value);
      if (this.type == 2) return CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame((CT_GraphicFrameModel) this.value);
      if (this.type == 3) return CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp((CT_ConnectorModel) this.value);
      if (this.type == 4) return CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic((CT_PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder from(
        CT_AbsSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel value) {
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
