package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ConnectorModel;
import com.scell.model.drawingml.chartDrawing.GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.GroupShapeModel;
import com.scell.model.drawingml.chartDrawing.GroupShapeNonVisualModel;
import com.scell.model.drawingml.chartDrawing.PictureModel;
import com.scell.model.drawingml.chartDrawing.ShapeModel;
import com.scell.model.drawingml.main.GroupShapePropertiesModel;
import java.lang.Object;
import java.util.List;

public class GroupShapeBuilder {
  private GroupShapeNonVisualModel nvGrpSpPr;

  private GroupShapePropertiesModel grpSpPr;

  private List<GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel> spOrGrpSpOrGraphicFrame;

  public GroupShapeBuilder() {
  }

  public GroupShapeBuilder setNvGrpSpPr(GroupShapeNonVisualModel nvGrpSpPr) {
    this.nvGrpSpPr = nvGrpSpPr;
    return this;
  }

  public GroupShapeBuilder setGrpSpPr(GroupShapePropertiesModel grpSpPr) {
    this.grpSpPr = grpSpPr;
    return this;
  }

  public GroupShapeBuilder setSpOrGrpSpOrGraphicFrame(
      List<GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel> spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public GroupShapeModel build() {
    return new GroupShapeModel(this.nvGrpSpPr, this.grpSpPr, this.spOrGrpSpOrGraphicFrame);
  }

  public GroupShapeBuilder from(GroupShapeModel value) {
    this.nvGrpSpPr = value.getNvGrpSpPr();
    this.grpSpPr = value.getGrpSpPr();
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

    public GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel build() {
      if (this.type == -1) return new GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel();
      if (this.type == 0) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newSp((ShapeModel) this.value);
      if (this.type == 1) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel.newPic((PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder from(
        GroupShapeModel.SpOrGrpSpOrGraphicFrameValueModel value) {
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
