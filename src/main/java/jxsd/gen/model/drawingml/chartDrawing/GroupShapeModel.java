package jxsd.gen.model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;
import java.util.List;
import jxsd.gen.builder.drawingml.chartDrawing.GroupShapeBuilder;
import jxsd.gen.model.drawingml.main.GroupShapePropertiesModel;

/**
 * This is a generated sequence class.
 */
public class GroupShapeModel {
  private final GroupShapeNonVisualModel nvGrpSpPr;

  private final GroupShapePropertiesModel grpSpPr;

  private final List<SpOrGrpSpOrGraphicFrame> spOrGrpSpOrGraphicFrame;

  public GroupShapeModel(GroupShapeNonVisualModel nvGrpSpPr, GroupShapePropertiesModel grpSpPr,
      List<SpOrGrpSpOrGraphicFrame> spOrGrpSpOrGraphicFrame) {
    this.nvGrpSpPr = nvGrpSpPr;
    this.grpSpPr = grpSpPr;
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
  }

  public GroupShapeBuilder builder() {
    return new GroupShapeBuilder().from(this);
  }

  public GroupShapeNonVisualModel getNvGrpSpPr() {
    return this.nvGrpSpPr;
  }

  public GroupShapePropertiesModel getGrpSpPr() {
    return this.grpSpPr;
  }

  public List<SpOrGrpSpOrGraphicFrame> getSpOrGrpSpOrGraphicFrame() {
    return this.spOrGrpSpOrGraphicFrame;
  }

  /**
   * This is a generated choice class.
   */
  public static class SpOrGrpSpOrGraphicFrame {
    private final int type;

    private final Object value;

    public SpOrGrpSpOrGraphicFrame() {
      this(-1, null);
    }

    private SpOrGrpSpOrGraphicFrame(Integer type, Object value) {
      this.type = type;
      this.value = value;
    }

    public GroupShapeBuilder.SpOrGrpSpOrGraphicFrame builder() {
      return new GroupShapeBuilder.SpOrGrpSpOrGraphicFrame().from(this);
    }

    public static SpOrGrpSpOrGraphicFrame newSp(ShapeModel value) {
      return new SpOrGrpSpOrGraphicFrame(0, value);
    }

    public boolean isSp() {
      return this.type == 0;
    }

    public ShapeModel getSp() {
      return (ShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrame newGrpSp(GroupShapeModel value) {
      return new SpOrGrpSpOrGraphicFrame(1, value);
    }

    public boolean isGrpSp() {
      return this.type == 1;
    }

    public GroupShapeModel getGrpSp() {
      return (GroupShapeModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrame newGraphicFrame(GraphicFrameModel value) {
      return new SpOrGrpSpOrGraphicFrame(2, value);
    }

    public boolean isGraphicFrame() {
      return this.type == 2;
    }

    public GraphicFrameModel getGraphicFrame() {
      return (GraphicFrameModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrame newCxnSp(ConnectorModel value) {
      return new SpOrGrpSpOrGraphicFrame(3, value);
    }

    public boolean isCxnSp() {
      return this.type == 3;
    }

    public ConnectorModel getCxnSp() {
      return (ConnectorModel) this.value;
    }

    public static SpOrGrpSpOrGraphicFrame newPic(PictureModel value) {
      return new SpOrGrpSpOrGraphicFrame(4, value);
    }

    public boolean isPic() {
      return this.type == 4;
    }

    public PictureModel getPic() {
      return (PictureModel) this.value;
    }
  }
}
