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

  private List<GroupShapeModel.SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame;

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
      List<GroupShapeModel.SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame) {
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

    public GroupShapeModel.SpOrGrpSpOrGraphicFrameModel build() {
      if (this.type == -1) return new GroupShapeModel.SpOrGrpSpOrGraphicFrameModel();
      if (this.type == 0) return GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newSp((ShapeModel) this.value);
      if (this.type == 1) return GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return GroupShapeModel.SpOrGrpSpOrGraphicFrameModel.newPic((PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder from(GroupShapeModel.SpOrGrpSpOrGraphicFrameModel value) {
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
