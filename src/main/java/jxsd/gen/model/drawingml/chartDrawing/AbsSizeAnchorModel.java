package jxsd.gen.model.drawingml.chartDrawing;

import java.lang.Integer;
import java.lang.Object;
import jxsd.gen.builder.drawingml.chartDrawing.AbsSizeAnchorBuilder;
import jxsd.gen.model.drawingml.main.PositiveSize2DModel;

/**
 * This is a generated sequence class.
 */
public class AbsSizeAnchorModel {
  private final MarkerModel from;

  private final PositiveSize2DModel ext;

  private final SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame;

  public AbsSizeAnchorModel(MarkerModel from, PositiveSize2DModel ext,
      SpOrGrpSpOrGraphicFrame spOrGrpSpOrGraphicFrame) {
    this.from = from;
    this.ext = ext;
    this.spOrGrpSpOrGraphicFrame = spOrGrpSpOrGraphicFrame;
  }

  public AbsSizeAnchorBuilder builder() {
    return new AbsSizeAnchorBuilder().from(this);
  }

  public MarkerModel getFrom() {
    return this.from;
  }

  public PositiveSize2DModel getExt() {
    return this.ext;
  }

  public SpOrGrpSpOrGraphicFrame getSpOrGrpSpOrGraphicFrame() {
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

    public AbsSizeAnchorBuilder.SpOrGrpSpOrGraphicFrame builder() {
      return new AbsSizeAnchorBuilder.SpOrGrpSpOrGraphicFrame().from(this);
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
