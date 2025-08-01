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

  private RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame;

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
      RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel spOrGrpSpOrGraphicFrame) {
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

    public RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel build() {
      if (this.type == -1) return new RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel();
      if (this.type == 0) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newSp((ShapeModel) this.value);
      if (this.type == 1) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel.newPic((PictureModel) this.value);
      return null;
    }

    public SpOrGrpSpOrGraphicFrameValueBuilder from(
        RelSizeAnchorModel.SpOrGrpSpOrGraphicFrameValueModel value) {
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
