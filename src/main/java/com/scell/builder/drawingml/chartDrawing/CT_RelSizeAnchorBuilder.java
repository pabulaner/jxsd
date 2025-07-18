package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_ConnectorModel;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeModel;
import com.scell.model.drawingml.chartDrawing.CT_MarkerModel;
import com.scell.model.drawingml.chartDrawing.CT_PictureModel;
import com.scell.model.drawingml.chartDrawing.CT_RelSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.CT_ShapeModel;
import java.lang.Object;

public class CT_RelSizeAnchorBuilder {
  private CT_MarkerModel from;

  private CT_MarkerModel to;

  private CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;

  public CT_RelSizeAnchorBuilder() {
  }

  public CT_RelSizeAnchorBuilder setFrom(CT_MarkerModel from) {
    this.from = from;
    return this;
  }

  public CT_RelSizeAnchorBuilder setTo(CT_MarkerModel to) {
    this.to = to;
    return this;
  }

  public CT_RelSizeAnchorBuilder setSpOrGrpSpOrGraphicFrame(
      CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public CT_RelSizeAnchorModel build() {
    return new CT_RelSizeAnchorModel(this.from, this.to, this.spOrGrpSpOrGraphicFrame);
  }

  public CT_RelSizeAnchorBuilder from(CT_RelSizeAnchorModel value) {
    this.from = value.getFrom();
    this.to = value.getTo();
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

    public CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel build() {
      if (this.type == -1) return new CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
      if (this.type == 0) return CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp((CT_ShapeModel) this.value);
      if (this.type == 1) return CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp((CT_GroupShapeModel) this.value);
      if (this.type == 2) return CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame((CT_GraphicFrameModel) this.value);
      if (this.type == 3) return CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp((CT_ConnectorModel) this.value);
      if (this.type == 4) return CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic((CT_PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder from(
        CT_RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel value) {
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
