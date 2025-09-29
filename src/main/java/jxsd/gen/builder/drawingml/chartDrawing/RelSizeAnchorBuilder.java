package jxsd.gen.builder.drawingml.chartDrawing;

import java.lang.Object;
import jxsd.gen.model.drawingml.chartDrawing.ConnectorModel;
import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameModel;
import jxsd.gen.model.drawingml.chartDrawing.GroupShapeModel;
import jxsd.gen.model.drawingml.chartDrawing.MarkerModel;
import jxsd.gen.model.drawingml.chartDrawing.PictureModel;
import jxsd.gen.model.drawingml.chartDrawing.RelSizeAnchorModel;
import jxsd.gen.model.drawingml.chartDrawing.ShapeModel;

/**
 * This is a generated sequence class.
 */
public class RelSizeAnchorBuilder {
  private MarkerModel from;

  private MarkerModel to;

  private RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame;

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
      RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public RelSizeAnchorBuilder from(RelSizeAnchorModel value) {
    this.from = value.getFrom();
    this.to = value.getTo();
    this.spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame();
    return this;
  }

  public RelSizeAnchorModel build() {
    return new RelSizeAnchorModel(this.from, this.to, this.spOrGrpSpOrGraphicFrame);
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

    public SpOrGrpSpOrGraphicFrame from(RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame value) {
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

    public RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame build() {
      if (this.type == -1) return new RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame();
      if (this.type == 0) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newSp((ShapeModel) this.value);
      if (this.type == 1) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return RelSizeAnchorModel.SpOrGrpSpOrGraphicFrame.newPic((PictureModel) this.value);
      return null;
    }
  }
}
