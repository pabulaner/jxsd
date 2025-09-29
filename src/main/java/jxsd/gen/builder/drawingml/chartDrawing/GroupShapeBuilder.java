package jxsd.gen.builder.drawingml.chartDrawing;

import java.lang.Object;
import java.util.List;
import jxsd.gen.model.drawingml.chartDrawing.ConnectorModel;
import jxsd.gen.model.drawingml.chartDrawing.GraphicFrameModel;
import jxsd.gen.model.drawingml.chartDrawing.GroupShapeModel;
import jxsd.gen.model.drawingml.chartDrawing.GroupShapeNonVisualModel;
import jxsd.gen.model.drawingml.chartDrawing.PictureModel;
import jxsd.gen.model.drawingml.chartDrawing.ShapeModel;
import jxsd.gen.model.drawingml.main.GroupShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class GroupShapeBuilder {
  private GroupShapeNonVisualModel nvGrpSpPr;

  private GroupShapePropertiesModel grpSpPr;

  private List<GroupShapeModel.SpOrGrpSpOrGraphicFrame> spOrGrpSpOrGraphicFrame;

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
      List<GroupShapeModel.SpOrGrpSpOrGraphicFrame> spOrGrpSpOrGraphicFrame) {
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
    return this;
  }

  public GroupShapeBuilder from(GroupShapeModel value) {
    this.nvGrpSpPr = value.getNvGrpSpPr();
    this.grpSpPr = value.getGrpSpPr();
    this.spOrGrpSpOrGraphicFrame = value.getSpOrGrpSpOrGraphicFrame();
    return this;
  }

  public GroupShapeModel build() {
    return new GroupShapeModel(this.nvGrpSpPr, this.grpSpPr, this.spOrGrpSpOrGraphicFrame);
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

    public SpOrGrpSpOrGraphicFrame from(GroupShapeModel.SpOrGrpSpOrGraphicFrame value) {
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

    public GroupShapeModel.SpOrGrpSpOrGraphicFrame build() {
      if (this.type == -1) return new GroupShapeModel.SpOrGrpSpOrGraphicFrame();
      if (this.type == 0) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newSp((ShapeModel) this.value);
      if (this.type == 1) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newGrpSp((GroupShapeModel) this.value);
      if (this.type == 2) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newGraphicFrame((GraphicFrameModel) this.value);
      if (this.type == 3) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newCxnSp((ConnectorModel) this.value);
      if (this.type == 4) return GroupShapeModel.SpOrGrpSpOrGraphicFrame.newPic((PictureModel) this.value);
      return null;
    }
  }
}
