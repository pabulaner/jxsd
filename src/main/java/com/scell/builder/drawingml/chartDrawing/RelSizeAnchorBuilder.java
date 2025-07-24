package com.scell.builder.drawingml.chartDrawing;

import com.scell.model.drawingml.chartDrawing.ConnectorModel;
import com.scell.model.drawingml.chartDrawing.GraphicFrameModel;
import com.scell.model.drawingml.chartDrawing.GroupShapeModel;
import com.scell.model.drawingml.chartDrawing.MarkerModel;
import com.scell.model.drawingml.chartDrawing.PictureModel;
import com.scell.model.drawingml.chartDrawing.RelSizeAnchorModel;
import com.scell.model.drawingml.chartDrawing.ShapeModel;
import java.lang.Object;

public class RelSizeAnchorBuilder {
  private MarkerModel from;

  private MarkerModel to;

  private RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame;

  public RelSizeAnchorBuilder() {
  }

  public RelSizeAnchorBuilder setFrom(MarkerModel from) {
    this.from = from;
    return this;
  }

  public RelSizeAnchorBuilder setTo(MarkerModel to) {
    this.to = to;
    return this;
  }

  public RelSizeAnchorBuilder setSpOrGrpSpOrGraphicFrame(
      RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public RelSizeAnchorModel build() {
    return new RelSizeAnchorModel(this.from, this.to, this.spOrGrpSpOrGraphicFrame);
  }

  public RelSizeAnchorBuilder from(RelSizeAnchorModel value) {
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

    public RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel build() {
      if (this.type == -1) return new RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel();
      if (this.type == 0) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newSp((ShapeModel) this.value);
      if (this.type == 1) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel.newPic((PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameBuilder from(
        RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameModel value) {
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
