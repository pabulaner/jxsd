package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.CT_ConnectorModel;
import com.scell.model.drawingml.chartDrawing.CT_GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeModel;
import com.scell.model.drawingml.chartDrawing.CT_GroupShapeNonVisualModel;
import com.scell.model.drawingml.chartDrawing.CT_PictureModel;
import com.scell.model.drawingml.chartDrawing.CT_ShapeModel;
import com.scell.model.drawingml.main.CT_GroupShapePropertiesModel;
import java.lang.Object;
import java.util.List;

public class CT_GroupShapeBuilder {
  private CT_GroupShapeNonVisualModel nvGrpSpPr;

  private CT_GroupShapePropertiesModel grpSpPr;

  private List<CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame;

  public CT_GroupShapeBuilder() {
  }

  public CT_GroupShapeBuilder setNvGrpSpPr(CT_GroupShapeNonVisualModel nvGrpSpPr) {
    this.nvGrpSpPr = nvGrpSpPr;
    return this;
  }

  public CT_GroupShapeBuilder setGrpSpPr(CT_GroupShapePropertiesModel grpSpPr) {
    this.grpSpPr = grpSpPr;
    return this;
  }

  public CT_GroupShapeBuilder setSpOrGrpSpOrGraphicFrame(
      List<CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public CT_GroupShapeModel build() {
    return new CT_GroupShapeModel(this.nvGrpSpPr, this.grpSpPr, this.spOrGrpSpOrGraphicFrame);
  }

  public CT_GroupShapeBuilder from(CT_GroupShapeModel value) {
    this.nvGrpSpPr = value.getNvGrpSpPr();
    this.grpSpPr = value.getGrpSpPr();
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

    public CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel build() {
      if (this.type == -1) return new CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel();
      if (this.type == 0) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newSp((CT_ShapeModel) this.value);
      if (this.type == 1) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp((CT_GroupShapeModel) this.value);
      if (this.type == 2) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame((CT_GraphicFrameModel) this.value);
      if (this.type == 3) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp((CT_ConnectorModel) this.value);
      if (this.type == 4) return CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newPic((CT_PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder from(
        CT_GroupShapeModel.SpOrGrpSpOrGraphicFrameModel value) {
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
