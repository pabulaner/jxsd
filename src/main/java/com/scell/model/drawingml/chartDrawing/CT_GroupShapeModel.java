package com.scell.model.drawingml.chartDrawing;

import com.scell.model.drawingml.main.CT_GroupShapePropertiesModel;
import java.lang.Integer;
import java.lang.Object;
import java.util.List;

public class CT_GroupShapeModel {
  private final CT_GroupShapeNonVisualModel nvGrpSpPr;

  private final CT_GroupShapePropertiesModel grpSpPr;

  private final List<SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame;

  public CT_GroupShapeModel(CT_GroupShapeNonVisualModel nvGrpSpPr,
      CT_GroupShapePropertiesModel grpSpPr,
      List<SpOrGrpSpOrGraphicFrameModel> spOrGrpSpOrGraphicFrame) {
    this.nvGrpSpPr = nvGrpSpPr;
    this.grpSpPr = grpSpPr;
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
  }

  public CT_GroupShapeNonVisualModel getNvGrpSpPr() {
    return this.nvGrpSpPr;
  }

  public CT_GroupShapePropertiesModel getGrpSpPr() {
    return this.grpSpPr;
  }

  public List<SpOrGrpSpOrGraphicFrameModel> getSpOrGrpSpOrGraphicFrame() {
    return this.spOrGrpSpOrGraphicFrame;
  }

  public static class SpOrGrpSpOrGraphicFrameModel {
    private final int type;

    private final Object value;

    public SpOrGrpSpOrGraphicFrameModel() {
      this(-1, null);
    }

    private SpOrGrpSpOrGraphicFrameModel(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newSp(CT_ShapeModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(0, value);
    }

    public boolean isSp() {
      return this.type == 0;
    }

    public CT_ShapeModel getSp() {
      return (CT_ShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newGrpSp(CT_GroupShapeModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(1, value);
    }

    public boolean isGrpSp() {
      return this.type == 1;
    }

    public CT_GroupShapeModel getGrpSp() {
      return (CT_GroupShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newGraphicFrame(CT_GraphicFrameModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(2, value);
    }

    public boolean isGraphicFrame() {
      return this.type == 2;
    }

    public CT_GraphicFrameModel getGraphicFrame() {
      return (CT_GraphicFrameModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newCxnSp(CT_ConnectorModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(3, value);
    }

    public boolean isCxnSp() {
      return this.type == 3;
    }

    public CT_ConnectorModel getCxnSp() {
      return (CT_ConnectorModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrameModel newPic(CT_PictureModel value) {
      return new SpOrGrpSpOrGraphicFrameModel(4, value);
    }

    public boolean isPic() {
      return this.type == 4;
    }

    public CT_PictureModel getPic() {
      return (CT_PictureModel) this.value;
    }
  }
}
